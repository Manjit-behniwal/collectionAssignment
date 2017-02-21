/*
 11. Write a program to count number of smaller elements on right 
of each element in an array.
 
Example :
Input:   arr[] =  {12, 1, 2, 3, 0, 11, 4}
Output:  countSmaller[]  =  {6, 1, 1, 1, 0, 1, 0}
 */
package smaller13;


public class Smaller13 {

    
    void constructLowerArray(int arr[], int Smaller13[], int n) 
    {
        int i, j;
 
         for (i = 0; i < n; i++)
           Smaller13[i] = 0;
 
        for (i = 0; i < n; i++) 
        {
            for (j = i + 1; j < n; j++) 
            {
                if (arr[j] < arr[i])
                    Smaller13[i]++;
            }
        }
    }
 
    void printArray(int arr[], int size) 
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
 
        System.out.println("");
    }
 
    public static void main(String[] args) 
    {
        Smaller13 small = new Smaller13();
        int arr[] = {12, 1, 2, 3, 0, 11, 4};
        int n = arr.length;
        int low[] = new int[n];
        small.constructLowerArray(arr, low, n);
        small.printArray(low, n);
    }
}
