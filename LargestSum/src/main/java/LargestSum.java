
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
        nums=new ArrayList<Integer>();
      List<Integer>  numsSum =  new ArrayList<Integer>();
        int sum=0;
        int max=0;
        
        for(int i=0;i<nums.size();i++){
            for(int j=1;j<nums.size();j++){
                sum=nums.get(i)+ nums.get(j);
                numsSum.add(sum);
            }
        }
        Iterator itr=numsSum.iterator();
        while(itr.hasNext()){ 
         itr.next();
          max=Collections.max(numsSum);
               
        } 
        return max;      
    }

}