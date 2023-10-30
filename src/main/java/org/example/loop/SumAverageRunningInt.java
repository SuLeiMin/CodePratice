package org.example.loop;

public class SumAverageRunningInt {
    public static void main(String[] args)
    {
        int sum = 0;
        double average ;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;

        for(int number = LOWERBOUND; number <= UPPERBOUND;++number)
        {
            sum += number*number;
        }
        //average = sum/2;
        System.out.println("The sum is : " + sum );
    }
}
