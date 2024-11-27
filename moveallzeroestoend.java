import java.util.*;
public class moveallzeroestoend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            }
        int count = 0;
        
        for (int i=0;i<n;i++){
            if (arr[i]!=0){
             arr[count]=arr[i];
             count++;

            }

        }
        while (count<arr.length){
            arr[count]=0;
            count++;
        }
        System.out.println(Arrays.toString(arr));

        
    }
    
}

