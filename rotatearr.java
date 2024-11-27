import java.util.*;
public class rotatearr {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("rotation value");
        int R = sc.nextInt();
        System.out.println("Enter size of the array");
        int n = sc.nextInt();
        int arr[]= new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter element at index "+i);
            arr[i]=sc.nextInt();
            
        }
        int start=0;
        int end=R;
        for (int i=0;i<R;i++){
            int first=arr[0];
            for(int j=0;j<n-1;j++){
                arr[j]=arr[j+1];
            }
           arr[n-1]=first;

        }
        System.out.println(Arrays.toString(arr));
        

        
    }
    
}
