/*
 5. Find the sum of k smallest elements in given unsorted array using TreeSet?
		Example : 
Input : 10, 30, 50, 67, 34, 68  k = 3
		    output : 74

 */
package treeset;

import java.util.*;
public class Treeset {

    public static void main(String[] args) {
         int sum = 0;
       
        TreeSet<Integer> t = new TreeSet<Integer>();
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(20);
        t.add(20);
        System.out.println(t);
      Iterator<Integer> itr = t.iterator();
        
        while(itr.hasNext())
        {
            Integer c = itr.next();
            
            sum = sum+c;
             System.out.println(sum);
        }
               
        
    }
    
}
