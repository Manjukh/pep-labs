
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
            int temp=nums.get(i);
            for(int j=i+1;j<=nums.size()-1  ;j++){
               int temp1=  nums.get(j);
               sum=temp+temp1;
                numsSum.add(sum);
          }  
        }
        Iterator itr=numsSum.iterator();
        while(itr.hasNext()){ 
        Object o= (itr.next());
          max=Collections.max(numsSum);
               
        } 
        return max;      
    }

}