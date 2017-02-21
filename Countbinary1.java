/*
 Count number of 1's in binary sorted array using binarySearch() function?Example :Input : 0, 0, 0 , 1, 1, 1, 1, 1
    output : 5
 */
package countbinary1;
import java.util.*;


public class Countbinary1 {

    
    int firstOne(int arr[], int low, int high) 
    {
        if (high >= low) 
        {
            
            int mid = low + (high - low) / 2;
            if ((mid == 1 || arr[mid - 1] == 0) && arr[mid] == 1)
                return mid;
 
            if (arr[mid] == 0) 
                return firstOne(arr, (mid + 1), high);
            else 
                return firstOne(arr, low, (mid - 1));
        }
        return -1;
    }
 
   
    int countOnes(int arr[], int n) 
    {
        
        int first = firstOne(arr, 1, n);
 
        
        if (first == -1)
            return 0;
 
        return (n - first);
    }
 public static void main(String[] args) 
    {
        Countbinary1 small = new Countbinary1();
        int arr[] = {0, 0, 0, 1,1, 1, 1, 1};
        int n = arr.length;  
        int low=1,high=n;
        int c = small.firstOne(arr, low, high);
        System.out.println("First one:" + c);
        int d = small.countOnes(arr, n);
        System.out.println("Total no. of ones:" + d);
    }
}
