package paket;

import java.util.Scanner;

public class Palindrom_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод слова
        System.out.print("Введите слово: ");
        String word = scanner.next();

        // Проверка на палиндром
        if (isPalindrome(word)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isPalindrome(String word) {
        return word.equals(new StringBuilder(word).reverse().toString());
    }
}
