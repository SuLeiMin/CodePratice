package org.example.loop;

public class ComputePI {
    public static void main(String[] args) {
        /*double sum = 0.0;
        int MAX_DENOMINATOR = 1000; // Try 10000, 100000, 1000000

        for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator += 2) {
            if (denominator % 4 == 1) {
                sum += 1.0 / denominator;
            } else if (denominator % 4 == 3) {
                sum -= 1.0 / denominator;
            } else {
                System.out.println("Impossible!!!");
            }
        }*/

        int MAX_TERM = 10;  // Number of terms used in computation
        double sum = 0.0;

        for (int term = 1; term <= MAX_TERM; term++) {
            if (term % 2 == 1) {  // Odd term number: add
                sum += 1.0 / (term * 2 - 1);
            } else {              // Even term number: subtract
                sum -= 1.0 / (term * 2 - 1);
            }
        }

        double pi_estimate = 4 * sum;
        //System.out.println("Approximation with " + MAX_DENOMINATOR + " terms: " + pi_estimate);
        double pi_error = Math.abs(Math.PI - pi_estimate);
        System.out.println("Error: " + pi_error);
    }
}
