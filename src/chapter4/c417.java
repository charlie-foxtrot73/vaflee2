package chapter4;

import java.util.Scanner;
public class c417 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalMi = 0;
        int totalGal = 0;

        System.out.println("gas mileage Calculator");

        while (true) {
            System.out.print("enter miles driven (or -1 to quit): ");
            int miles = scanner.nextInt();

            if (miles == -1) {
                break;
            }

            System.out.print("enter gallons used: ");
            int gallons = scanner.nextInt();

            double mpg = (double) miles / gallons;
            System.out.printf("mpg for this trip: %.2f%n", mpg);

            totalMi += miles;
            totalGal += gallons;

            double combinedMpg = (double) totalMi / totalGal;
            System.out.printf("combined mpg for all trips: %.2f%n", combinedMpg);
        }
        scanner.close();
    }
}
