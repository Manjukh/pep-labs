
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.print.attribute.IntegerSyntax;


public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        List<Integer> al= new ArrayList<Integer>();
        
        for (int i = 0; i < arr1.length; i++)
            al.add(arr1[i]);
            for (int j = 0; j < arr2.length; j++)
            al.add(arr2[j]);
            Integer[] arr = new Integer[al.size()];
  
       
        for (int i = 0; i < al.size(); i++)
            arr[i] = al.get(i);

        return int(arr);
    }
}
