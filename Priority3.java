/*
 Find the Kth smallest elment from the unsorted arrya using PriorityQueue class?
	Example :Input : 10, 30, 50, 67, 34, 68
	  k = 3   output : 34 
 */
package priority3;
import java.util.*;


public class Priority3 {

	public static int find(int [] nums, int k){
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i=0;i<nums.length;i++){
			pq.offer(nums[i]);
		}
		int n = -1;
		while(k>0){
			n = pq.poll();
			k--;
		}
		return n;
	}
public static void main(String[] args) {
    Priority3 a= new Priority3();
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
       System.out.println("kth Smallest element is");
      System.out.println(a.find(nums,k));
    //int c= find(nums,k);
    //System.out.println("smallest element:" + c);
    //System.out.println("smallest element:" + find(nums,k));

	}

}