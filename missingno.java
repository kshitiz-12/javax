import java.util.Arrays;
import java.util.Scanner;
public class missingno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<n;i++){
            System.out.println("enter the element:");
            arr[i] = sc.nextInt();

        }
        int res=1;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]==res){
                res++;
        }
        else if (arr[i]>res){
            break;
        }
        
    }
    System.out.println(res);
    
}
}
