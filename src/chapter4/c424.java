package chapter4;

import java.util.Scanner;
public class c424 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        while (studentCounter <= 10) {
            System.out.print("enter result (1 = pass, 2 = fail): ");
            int result = input.nextInt();

            if (result == 1) {
                passes = passes + 1;
            } else if (result == 2) {
                failures = failures + 1;
            } else {
                System.out.println("invalid input (1 or 2)");
                continue;
            }

            studentCounter = studentCounter + 1;
        }

        // Display results
        System.out.printf("passed: %d%nfailed: %d%n", passes, failures);

        input.close();
    }
}