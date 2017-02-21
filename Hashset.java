/*
Consider a set of strings, write a java program to find the number duplicate  using HashSet?
	
Example : Input : {"raudra", "ravi", "java", "ravula", "ravi", "ravula"}
	
		  Output : 2 
 
 */
package hashset;
import java.util.HashSet;


public class Hashset {

    
    public static void main(String[] args) {
        int count=0;
   
        String[] strArray = {"raudra", "ravi","java", "ravula", "ravi", "ravula"};
 
        HashSet<String> set = new HashSet<String>();
 
        for (String arrayElement : strArray)
        {
            if(!set.add(arrayElement))
            {
                System.out.println("Duplicate Elements are : "+arrayElement);
                count++;
            }
        }
        System.out.println("No. of Duplicate Element are : "+count);
    }    
}
