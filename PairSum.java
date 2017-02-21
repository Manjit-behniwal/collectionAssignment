/*
 7. Given an array A[] and a number x, check for pair in A[] with sum as x using HashMap?

	Example :Input : 10, 30, 50, 67, 34, 68   x = 60   output : 10, 30

 */
package pairsum;
import java.io.*;

class PairSum
{
    private static final int MAX = 100000; 
 
    static void printpairs(int arr[],int sum)
    {
        
        boolean[] binmap = new boolean[MAX];
 
        for (int i=0; i<arr.length; ++i)
        {
            int temp = sum-arr[i];
 
            
            if (temp>=0 && binmap[temp])
            {
                System.out.println("Pair with given sum " +
                                    sum + " is (" + arr[i] +
                                    ", "+temp+")");
            }
            binmap[arr[i]] = true;
        }
    }

    public static void main (String[] args)
    {
        int A[] = {10, 30, 50, 67, 34, 68};
        int n = 60;
        printpairs(A,  n);
    }
}