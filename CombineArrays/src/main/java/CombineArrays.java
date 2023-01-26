
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
        int l= arr1.length+arr2.length;
        int[] al= new int[l];
        for(int i=0;i< arr1.length;i++){
            al[i]=arr1[i];
        }
        for(int j=0;j< arr2.length;j++){
            al[arr1.length+j]=arr2[j];
        }
        return al;
    }
    }

