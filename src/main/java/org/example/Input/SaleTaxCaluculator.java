package org.example.Input;

import java.util.Scanner;

public class SaleTaxCaluculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalPrice = 0.0;
        double totalActualPrice = 0.0;
        double totalSalesTax = 0.0;

        System.out.println("Sales Tax Calculator");
        System.out.println("Enter the tax-inclusive price (or -1 to end):");

        while (true) {
            System.out.print("$");
            double taxInclusivePrice = scanner.nextDouble();

            if (taxInclusivePrice == -1) {
                System.out.println("Total Price: $" + totalPrice);
                System.out.println("Total Actual Price: $" + totalActualPrice);
                System.out.println("Total Sales Tax: $" + totalSalesTax);
                break;
            }

            // Calculate actual price and sales tax
            double salesTax = taxInclusivePrice / 1.13 * 0.13;
            double actualPrice = taxInclusivePrice - salesTax;

            totalPrice += taxInclusivePrice;
            totalActualPrice += actualPrice;
            totalSalesTax += salesTax;

            System.out.printf("Actual Price: $%.2f%n", actualPrice);
            System.out.printf("Sales Tax: $%.2f%n", salesTax);
        }

        scanner.close();
    }
}
