
public class Palindrome {
    /**
     * Palindromes are words that are the same forwards as they are backwards - eg, 'bob', 'racecar'.
     *
     * You can solve this problem in several ways:
     * You could start with a String reversal algorithm, which you have already written, and check if str is the same
     * as its reversed form, or, you could check if the character at the nth position of a String moving forwards
     * re the same as the nth position of a String moving backwards.
     *
     * @param str A String.
     * @return true if str is a palindrome, false otherwise.
     */
    public boolean pal(String str){
        StringBuilder sb= new StringBuilder(str);
    System.out.println(str);
    StringBuilder sb1= sb.reverse();
    String tr1=sb1.toString();
    System.out.println(sb1);
    System.out.println(tr1);
    
    boolean out=tr1.equals(str);
    System.out.println(out);
    
    


        return out;
    }
}
