import java.util.*;
public class anagramcheck {
    public static boolean anagramCheck(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;

    }
    char[] chararr1 = str1.toCharArray();
    char[] chararr2 = str2.toCharArray();

    Arrays.sort(chararr1);
    Arrays.sort(chararr2);
    return Arrays.equals(chararr1, chararr2);
        
    
}
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter str1;");
    String str1 = sc.nextLine();
    System.out.println("enter str2;");
    String str2 = sc.nextLine();
    if(anagramCheck(str1, str2)){
        System.out.println("anagrams");
    }
    else{
        System.out.println("not anagrams");
    }
   

}
}
