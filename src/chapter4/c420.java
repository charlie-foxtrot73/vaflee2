package chapter4;

import java.util.Scanner;
public class c420 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfEmployees = 3;

        for (int i = 1; i <= numberOfEmployees; i++) {
            System.out.printf("enter hours worked for employee %d: ", i);
            int hoursWorked = scanner.nextInt();

            System.out.printf("enter hourly rate for employee %d: $", i);
            double hourlyRate = scanner.nextDouble();

            double grossPay = calculateGrossPay(hoursWorked, hourlyRate);

            System.out.printf("gross pay for employee %d: $%.2f%n", i, grossPay);
        }

        scanner.close();
    }

    public static double calculateGrossPay(int hoursWorked, double hourlyRate) {
        double grossPay;

        if (hoursWorked <= 40) {
            grossPay = hoursWorked * hourlyRate;
        } else {
            int overtimeHours = hoursWorked - 40;
            grossPay = (40 * hourlyRate) + (overtimeHours * hourlyRate * 1.5);
        }
        return grossPay;
    }
}