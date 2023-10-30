package org.example.loop;

public class ExtractDigits {
    public static void main(String[] args) {
        int number = 221199;
        System.out.println("Original number: " + number);

        // Convert the number to a string to extract digits
        String numberString = Integer.toString(number);

        // Iterate through the string in reverse and print each digit
        for (int i = numberString.length() - 1; i >= 0; i--) {
            System.out.print(numberString.charAt(i) + " ");
        }
    }
}
