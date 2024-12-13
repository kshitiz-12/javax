import java.util.*;
public class nonrepeatingchar {
    public static char nonrepeat(String s1){
        int n = s1.length();
        for (int i = 0 ; i < n; i++) {
            boolean found = false;
            for (int j = 0 ; j < n; j++) {
                if (s1.charAt(i) == s1.charAt(j) && i != j) {
                    found = true;
                    break;
            }
            }
            if (found==false){
              return s1.charAt(i);
            }
        }
        return '$';

            
            

      
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println("the non  repeating cchar is "+ nonrepeat(s1));
        
    }
    
}
