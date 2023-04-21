// Вычислить n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число n: ");
            int n = scanner.nextInt();

            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            System.out.println("Факториал числа " + n + " равен " + factorial);
        }
    }
}