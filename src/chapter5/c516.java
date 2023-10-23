package chapter5;

import java.util.Scanner;
public class c516 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("enter a number in range 1-30: ");
            int num = scanner.nextInt();

            if (num < 1 || num > 30) {
                System.out.println("invalid (1-30)");
                i--;
            } else {
                numbers[i] = num;
            }
        }

        System.out.println("\nbar chart:");

        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[i] + ": ");
            for (int j = 0; j < numbers[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
