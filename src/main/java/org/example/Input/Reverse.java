package org.example.Input;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int sum = calculateDigitSum(number);
            System.out.println("The sum of all digits is: " + sum);
        }

        scanner.close();
    }

    public static int calculateDigitSum(int num) {
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;  // Extract the rightmost digit
            sum += digit;
            num /= 10;  // Remove the rightmost digit
        }

        return sum;
    }
}
