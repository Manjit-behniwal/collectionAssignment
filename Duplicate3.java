/*
 Find the number of distinct duplicate elements in given array?
 */
package duplicate3;
import java.util.HashSet;


public class Duplicate3 {
 
   
    public static void main(String[] args) 
    {
        int count =0;
        Integer[] strArray = {1,2,3,3,4,5,6,6,77,8,77};
 
        HashSet<Integer> set = new HashSet<Integer>();
 
        for (Integer arrayElement : strArray)
        {
            if(set.add(arrayElement)==false)
            {
                System.out.println("Duplicate Element is : "+arrayElement);
               count++;
               
                System.out.println("no of Duplicate Elements are : "+count);
                
            }
       
        }
        
    }    
}
