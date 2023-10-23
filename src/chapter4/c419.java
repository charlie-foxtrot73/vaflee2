package chapter4;

import java.util.Scanner;
public class c419 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double baseSalary = 200.0;
        double commissionRate = 0.09;
        double totalSales = 0.0;

        System.out.print("enter the number of items sold: ");
        int numberOfItems = scanner.nextInt();

        for (int i = 1; i <= numberOfItems; i++) {
            System.out.printf("enter the value of item %d: $", i);
            double itemValue = scanner.nextDouble();
            totalSales += itemValue;
        }

        double earnings = baseSalary + (totalSales * commissionRate);
        System.out.printf("total earnings for the salesperson: $%.2f%n", earnings);

        scanner.close();
    }
}
