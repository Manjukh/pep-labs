import java.util.Arrays;

public class Isogram {
    /**
     * An Isogram is a word where no letters are repeated. You may assume that there will only be lowercase
     * letters in the String.
     *
     * For instance, "cat", "isogram", "uncopyrightable" are isograms. "egg", "java", "programming" are not.
     * You could use a Set of characters or a Map of characters to int or boolean to solve this problem.
     * You could even solve it with an array of 26 booleans, and convert characters to an index of that array.
     * It's also possible to solve this with nested for loops.... but it's not as easy or efficient.
     *
     * @param str a String.
     * @return true if str is an isogram, false otherwise.
     */
    public boolean isIsogram(String str){
        char[] char1=str.toCharArray();
        Arrays.sort(char1);
       boolean b=false;
        int key=0;
        while(key<char1.length){
       int result=Arrays.binarySearch(char1,char1[key]);
       
       if(result <0)
       b=true;

       else if(result>0)
        b=false;
        key++;
          }  
          return b;
    }
}
