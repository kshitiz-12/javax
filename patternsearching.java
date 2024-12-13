import java.util.*;
public class patternsearching {
    public static List<Integer> patterns(String txt, String pat){
        List<Integer> result = new ArrayList<>();
        int patlen = pat.length();
        int txtlen = txt.length();
        for (int i=0;i<=(txtlen-patlen);i++){
            if(txt.substring(i, i+patlen).equals(pat)){
                result.add(i);
            }
        }
        return result;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter text");
        String txt = sc.nextLine();
        System.out.println("enter pattern");
        String pat = sc.nextLine();

        List <Integer> occ  = patterns(txt, pat);
        if(occ.isEmpty()){
            System.out.println("no occurences");

        }
        else{
            System.out.println("indices are"+occ);
        }
    }
    
}
