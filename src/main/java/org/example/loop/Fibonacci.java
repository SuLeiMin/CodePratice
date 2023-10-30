package org.example.loop;

public class Fibonacci {
    public static void main (String[] args) {
        int n = 3;          // The index n for F(n), starting from n=3, as n=1 and n=2 are pre-defined
        int fn;             // F(n) to be computed
        int fnMinus1 = 1;   // F(n-1), init to F(2)
        int fnMinus2 = 1;   // F(n-2), init to F(1)
        int nMax = 20;      // maximum n, inclusive
        int sum = fnMinus1 + fnMinus2;  // Need sum to compute average
        double average;

        System.out.println("The first " + nMax + " Fibonacci numbers are:");

        // Print the first two pre-defined Fibonacci numbers
        System.out.print("1 1 ");

        while (n <= nMax) {  // n starts from 3
            // Compute F(n), print it, and add it to the sum
            fn = fnMinus1 + fnMinus2;
            System.out.print(fn + " ");
            sum += fn;

            // Increment the index n and shift the numbers for the next iteration
            ++n;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
        }

        // Compute and display the average (=sum/nMax).
        average = (double)sum / nMax;
        System.out.println("\nThe average is: " + average);
    }
}
