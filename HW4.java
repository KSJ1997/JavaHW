// Реализовать простой калькулятор (введите первое число, введите требуемую операцию, введите второе число, ответ):

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите первое число: ");
            double num1 = scanner.nextDouble();

            System.out.print("Введите требуемую операцию (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();

            double result;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Ошибка! Неверная операция.");
                    return;
            }

            System.out.println("Результат: " + result);
        }
    }
}