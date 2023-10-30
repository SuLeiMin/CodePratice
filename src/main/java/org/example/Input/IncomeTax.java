package org.example.Input;

import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Income Tax Calculator");
        System.out.println("Enter the taxable income (or -1 to end):");

        double income;

        while (true) {
            System.out.print("$");
            income = scanner.nextDouble();

            if (income == -1) {
                System.out.println("bye!");
                break;
            }

            double tax = calculateIncomeTax(income);
            System.out.printf("The income tax payable is: $%.2f%n", tax);

            System.out.print("Enter the taxable income (or -1 to end): $");
        }

        scanner.close();
    }

    public static double calculateIncomeTax(double income) {
        double tax;

        if (income <= 48535) {
            tax = income * 0.15;
        } else if (income <= 97069) {
            tax = 48535 * 0.15 + (income - 48535) * 0.205;
        } else if (income <= 150473) {
            tax = 48535 * 0.15 + (97069 - 48535) * 0.205 + (income - 97069) * 0.26;
        } else if (income <= 214368) {
            tax = 48535 * 0.15 + (97069 - 48535) * 0.205 + (150473 - 97069) * 0.26 + (income - 150473) * 0.29;
        } else {
            tax = 48535 * 0.15 + (97069 - 48535) * 0.205 + (150473 - 97069) * 0.26 + (214368 - 150473) * 0.29 + (income - 214368) * 0.33;
        }

        return tax;
    }
}
