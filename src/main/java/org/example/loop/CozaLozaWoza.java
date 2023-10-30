package org.example.loop;

public class CozaLozaWoza {
    public static void main(String[] args) {
        final int LOWERBOUND = 1, UPPERBOUND = 11;
        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            // number = LOWERBOUND+1, LOWERBOUND+2, ..., UPPERBOUND
            // Print "Coza" if number is divisible by 3
            if ( number /3 == 0 ) {
                System.out.println("Coza");
            }
            // Print "Loza" if number is divisible by 5
            if ( number /5 == 0 ) {
                System.out.println("Loza");
            }
            // Print "Woza" if number is divisible by 7
            if ( number / 7 == 0 ) {
                System.out.println("Woza");
            }
            // Print the number if it is not divisible by 3, 5 and 7 (i.e., it has not been processed above)
            if ( number / 3 != 0 && number /5 != 0 && number/7 !=0 ) {
                System.out.println("number : " + number);
            }
            // After processing the number, print a newline if number is divisible by 11;
            // else print a space
            if ( number /11 == 0 ) {
                System.out.println();  // print newline
            } else {
                System.out.print( " ");  // print a space
            }
        }
    }
}
