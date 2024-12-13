import java.util.*;
public class minchngetopalin {
    public static int palindrome (String s){
        String reversed = new StringBuilder(s).reverse().toString();
        String temp = s + "#" + reversed;
        int[] lps = computeLPSArray(temp);
        int longestpalindrome = lps[lps.length-1];
        return s.length()-longestpalindrome;

    }
    private static int[] computeLPSArray(String s) {
        int n = s.length();
        int[] lps = new int[n];
        int len = 0;
        int i = 1;
        while (i < n) {
            if (s.charAt(i) == s.charAt(len)) {
                len ++;
                lps[i]=len;
                i++;
            }   
            else if (len != 0) {
                len = lps[len-1];
                
            }
            else{
                lps[i]=0;
                i++;
            }

                
    }
    return lps;
    
}
}
    
