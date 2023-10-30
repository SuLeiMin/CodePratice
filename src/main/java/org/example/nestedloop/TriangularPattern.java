package org.example.nestedloop;

import java.util.Scanner;

public class TriangularPattern{
 public static void main(String [] args){
     Scanner sc =  new Scanner(System.in);
     int size = sc.nextInt();
    // Outer loop to print each of the rows
      for (int row = 1; row <= size; row++) {  // row = 1, 2, 3, ..., size
        // Inner loop to print each of the columns of a particular row
        for (int col = 1; col <= size; col++) {  // col = 1, 2, 3, ..., size
            if (row >= col) {
                System.out.print("# ");
            } else {
                System.out.print("  ");  // Need to print the "leading" blanks
            }
        }
        // Print a newline after printing all the columns
        System.out.println();
    }
}
}
