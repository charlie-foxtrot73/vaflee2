package chapter5;

import java.util.Scanner;
public class c511 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the number of values to compare: ");
        int numValues = scanner.nextInt();

        if (numValues <= 0) {
            System.out.println("enter a valid number of values.");
            scanner.close();
            return;
        }

        int smallest = Integer.MAX_VALUE;

        for (int i = 1; i <= numValues; i++) {
            System.out.printf("enter value #%d: ", i);
            int value = scanner.nextInt();

            if (value < smallest) {
                smallest = value;
            }
        }
        System.out.println("the smallest value is: " + smallest);

        scanner.close();
    }
}