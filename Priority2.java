/*
 Find the Kth largest element from the given array using PriorityQueue class?
Example :Input : 10, 30, 50, 67, 34, 68
   k = 3  output : 50
 */
package priority2;
import java.util.*;

class Priority2 {
public int findKthLargest(int[] nums, int k) {
        int p = 0;
        int numElements = nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for (int n : nums){
            pq.add(n);
        }

        while (numElements-k+1 > 0){
            p = pq.poll();
            k++;
        }

        return p;
    }


public static void main(String[] args) {
   
    Priority2 a= new Priority2();
    Scanner s = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = s.nextInt();
        int[] nums = new int[n];
        System.out.println("enter elements of array");
        for(int i=0;i<n;i++)
        {
            nums[i]=s.nextInt();
        
        }
        Scanner r = new Scanner(System.in);
        System.out.println("enter kth element");
        int k = r.nextInt();
       //int c= nums.length;
       System.out.println("kth largest element is");
       System.out.println(a.findKthLargest(nums,k));
}
	
}
