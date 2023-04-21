//Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1 и на себя без остатка).

public class HW3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= 1000; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sb.append(i).append(" ");
            }
        }
        System.out.println("Все простые числа от 1 до 1000: " + sb.toString());
    }
}