/*
 9. Find four elements a, b, c and d in an array 
such that a+b = c+d using HashMap?
 */
package array12;
import java.io.*;
import java.util.*;


public class Array12 {

    class pair
    {
        int first, second;
        pair(int f,int s)
        {
            first = f; second = s;
        }
    };
 
    boolean findPairs(int arr[])
    {
        HashMap<Integer,pair> map = new HashMap<Integer,pair>();
        int n=arr.length;
       for (int i=0; i<n; ++i)
        {
            for (int j=i+1; j<n; ++j)
            {
                
                int sum = arr[i]+arr[j];
                if (!map.containsKey(sum))
                    map.put(sum,new pair(i,j));
 
                else 
                {
                    pair p = map.get(sum);
 
                    
                    System.out.println("("+arr[p.first]+", "+arr[p.second]+
                                      ") and ("+arr[i]+", "+arr[j]+")");
                    return true;
                }
            }
        }
        return false;
    }
 
    public static void main(String args[])
    {
        int arr[] = {1,3,5,2,7,};
        Array12 a = new Array12();
        a.findPairs(arr);
    }
}



