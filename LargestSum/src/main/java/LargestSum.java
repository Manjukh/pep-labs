
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
      List<Integer> nums2=new ArrayList<Integer>(nums);
      
      int sum=0;
      int temp1=0;
      int temp2=0;
      int temp3=0;
      int max=0;
      temp1=Collections.max(nums2);
      System.out.println("temp1"+temp1);
      temp3=temp1;
      System.out.println("temp3"+temp3);
     int index=nums2.indexOf(temp1);
      temp3=temp1;
     System.out.println("index"+index);
     nums2.set(index,0);
      temp2=Collections.max(nums2);
      System.out.println("temp2"+temp2);
      sum=temp3+temp2;
System.out.println("sum"+sum);
return sum;
   
}}