package chapter5;

import java.util.Scanner;
public class c517 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalRetailValue = 0.0;

        System.out.println("Product List:");
        System.out.println("1 - product 1 ($2.98)");
        System.out.println("2 - product 2 ($4.50)");
        System.out.println("3 - product 3 ($9.98)");
        System.out.println("4 - product 4 ($4.49)");
        System.out.println("5 - product 5 ($6.87)");

        while (true) {
            System.out.print("enter product number (1-5) or -1 to exit: ");
            int prodNum = scanner.nextInt();

            if (prodNum == -1) {
                break;
            }

            if (prodNum < 1 || prodNum > 5) {
                System.out.println("invalid product number; enter a number between 1 and 5.");
                continue;
            }

            System.out.print("enter quantity sold: ");
            int quantitySold = scanner.nextInt();

            double retailPrice = getRetailPrice(prodNum);
            double productTotal = retailPrice * quantitySold;
            totalRetailValue += productTotal;
        }

        System.out.printf("total retail value of products sold: $%.2f%n", totalRetailValue);

        scanner.close();
    }

    public static double getRetailPrice(int productNumber) {
        switch (productNumber) {
            case 1:
                return 2.98;
            case 2:
                return 4.50;
            case 3:
                return 9.98;
            case 4:
                return 4.49;
            case 5:
                return 6.87;
            default:
                return 0.0;
        }
    }
}
