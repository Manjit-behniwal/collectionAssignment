/*
 10. Find Majority Element in given array?
Majority Element :  A majority element in an array A[] of size n is an element 
that appears more than n/2 times (and hence there is at most one such element?
 */
package majority1;
import java.io.*;


class Majority1 {
 
    static boolean isMajority1(int arr[], int n, int x)
    {
        int i, last_index = 0;
 
        
        last_index = (n%2==0)? n/2: n/2+1;
 
        
        for (i = 0; i < last_index; i++)
        {
            if (arr[i] == x && arr[i+n/2] == x)
                return true;
        }
        return false;
    }
 
     public static void main (String[] args) {
        int arr[] = {1, 2, 3, 4, 4, 4, 4};
        int n = arr.length;
        int x = 4;
        if (isMajority1(arr, n, x)==true)
           System.out.println(x+" appears more than "+
                              n/2+" times in arr[]");
        else
           System.out.println(x+" does not appear more than "+
                              n/2+" times in arr[]");
    }
}
