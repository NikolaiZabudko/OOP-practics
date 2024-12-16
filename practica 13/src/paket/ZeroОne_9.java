package paket;

import java.util.Scanner;
public class ZeroОne_9 {

    // Функция для вычисления биномиального коэффициента C(n, k)
    public static long binomialCoefficient(int n, int k) {
        if (k > n) return 0;
        if (k == 0 || k == n) return 1;
        long result = 1;
        for (int i = 1; i <= k; i++) {
            result = result * (n - i + 1) / i;
        }
        return result;
    }

    // Функция для вычисления количества последовательностей
    public static long countSequences(int a, int b) {
        if (a > b + 1) {
            return 0; // Слишком много нулей, они обязательно будут рядом
        }
        return binomialCoefficient(a + b, a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество нулей a: ");
        int a = scanner.nextInt();
        System.out.print("Введите количество единиц b: ");
        int b = scanner.nextInt();

        long result = countSequences(a, b);
        System.out.println("Количество подходящих последовательностей: " + result);
    }
}
