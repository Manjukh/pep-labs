import java.util.ArrayList;
import java.util.Arrays;


public class InsertPosition {

    /**
     * Find the position that a number should be inserted into in a sorted array.
     * For instance, in the array {2,4,6,8,10}, inserting 5 would belong at position 2, since the resulting array
     * would be {2,4,5,6,8,10}, where the index of 5 is 2 (remember zero-indexing.)
     * See the test cases for more examples.
     *
     * You may assume no duplicate values.
     *
     * @param nums an array of ints.
     * @param target the number that would hypothetically be inserted.
     * @return return the index that a number should be inserted into a sorted array.
     */
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
  int indexof=0;
 
  
 int[] arrRes= new int[n+1];
   
  for(int i=0;i<n;i++){
  
  arrRes[i]=nums[i];
 
    
  }
   
   arrRes[n]=target;
   Arrays.sort(arrRes);
for (int num : arrRes) {
            System.out.print(num + " ");
        }
        
        ArrayList<Integer> clist = new ArrayList<>();
 
        
        for (int i : arrRes)
            clist.add(i);
 
        
     indexof=  clist.indexOf(target);
     System.out.println(indexof);


    return (int)indexof;
    }
}

