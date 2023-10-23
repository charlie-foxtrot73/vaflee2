package chapter4;

import java.util.Scanner;
public class c418 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int accountNumber;
        int beginningBalance;
        int totalCharges;
        int totalCredits;
        int creditLimit;

        System.out.println("credit limit calculator");

        while (true) {
            System.out.print("enter account number (or -1 to quit): ");
            accountNumber = scanner.nextInt();

            if (accountNumber == -1) {
                break;
            }

            System.out.print("enter beginning balance: ");
            beginningBalance = scanner.nextInt();
            System.out.print("enter total charges: ");
            totalCharges = scanner.nextInt();
            System.out.print("enter total credits: ");
            totalCredits = scanner.nextInt();
            System.out.print("enter credit limit: ");
            creditLimit = scanner.nextInt();

            int newBalance = beginningBalance + totalCharges - totalCredits;
            System.out.printf("new balance for account %d: %d%n", accountNumber, newBalance);

            if (newBalance > creditLimit) {
                System.out.println("credit limit exceeded");
            }
        }
        scanner.close();
    }
}
