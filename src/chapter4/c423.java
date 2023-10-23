package chapter4;

import java.util.Scanner;
public class c423 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("enter number #%d: ", i);
            int number = scanner.nextInt();

            if (number > largest) {
                secondLargest = largest; // upd secondLargest w/ the prev largest val
                largest = number; // upd largest w/ the new largest val
            } else if (number > secondLargest && number != largest) {
                secondLargest = number; // update secondLargest if the number is greater but != largest
            }
        }

        System.out.println("the largest number is: " + largest);
        System.out.println("the second largest number is: " + secondLargest);

        scanner.close();
    }
}