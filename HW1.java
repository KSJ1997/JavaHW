// Вычислить n-ое треугольного число (сумма чисел от 1 до n)

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число n: ");
            int n = scanner.nextInt();

            int triangularNumber = 0;
            for (int i = 1; i <= n; i++) {
                triangularNumber += i;
            }

            System.out.println("n-ое треугольное число равно " + triangularNumber);
        }
    }
}