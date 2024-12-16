package paket;

import java.util.Scanner;

public class Reverse_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод числа
        System.out.print("Введите число: ");
        int n = scanner.nextInt();

        // Переменная для хранения перевернутого числа
        int reversed = 0;

        // Переворот числа
        while (n != 0) {
            int digit = n % 10; // Получаем последнюю цифру
            reversed = reversed * 10 + digit; // Добавляем цифру к результату
            n /= 10; // Убираем последнюю цифру из n
        }

        // Вывод результата
        System.out.println("Перевернутое число: " + reversed);
    }
}

