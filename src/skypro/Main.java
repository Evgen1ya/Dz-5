package skypro;
import java.util.Arrays;

public class Main {
    static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            System.out.println(arr[i] + "\n");
        }
        return arr;
    }

    public static void main(String[] args) {
        // Задача 1
        System.out.print("Задача 1 \n");
        int sumPerMonth = 0;
        for (int i = 0; i < (arr.length - 1); i++) {
            sumPerMonth += arr[i];
        }
        System.out.println( "Сумма трат за месяц составила " + sumPerMonth + " рублей." );

        //Задача 2
        System.out.print("\n Задача 2 \n");
        int maxSum = -1;
        int minSum = 300_000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSum) {
                maxSum = arr[i];
            }
            if (arr[i] < minSum) {
                minSum = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составил " + maxSum + " рублей.");
        System.out.println("Минимальная сумма трат за день составил " + minSum + " рублей.");

        //Задача 3
        System.out.print(" \n Задача 3 \n");
        float midSumByDay = 0f;
        midSumByDay = sumPerMonth / 30f;
        System.out.println("Средняя сумма трат за день составил " + midSumByDay + " рублей.");

        //Задача 4
        System.out.print(" \n Задача 4 \n");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            Object temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName [reverseFullName.length - 1 - i] = (char) temp;
            System.out.println(reverseFullName);
        }
        System.out.println( reverseFullName);
        //Делала по шпаргалке, но получаются квадратики, а не буквы. Нашла в гугле, но не понимаю, как оно работает.
    }
}