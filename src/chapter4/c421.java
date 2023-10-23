package chapter4;

// Pseudocode
//Initialize counter to 1
//Initialize largest to 0 (or any small negative number)
//While counter is less than or equal to 10:
//    Prompt the user to input a number and store it in the variable number
//    If number is greater than largest:
//        Set largest to number
//    Increment counter by 1
//End While
//Print the largest number


import java.util.Scanner;
public class c421 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int largest = Integer.MIN_VALUE;

        System.out.println("enter 10 integers:");

        while (counter <= 10) {
            System.out.printf("enter number #%d: ", counter);
            int number = scanner.nextInt();

            if (number > largest) {
                largest = number;
            }

            counter++;
        }

        System.out.println("the largest number is: " + largest);

        scanner.close();
    }
}