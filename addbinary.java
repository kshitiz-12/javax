import java.util.*;
public class addbinary {
    public static String addbinaryx (String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while (i >= 0 || j >= 0 || carry > 0) {
            int bit1 = (i>=0)?a.charAt(i)-'0':0;
            int bit2 = (j>=0)?b.charAt(j)-'0':0;
            int sum = bit1 + bit2 + carry;
            result.append(sum%2);
            carry=sum/2;
            i--;
            j--;

      
        

    }
    return result.reverse().toString();
    
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    String b = sc.nextLine();
    
    System.out.println("Result: " + addbinaryx(a, b)); // Output: 1111110
}
}

