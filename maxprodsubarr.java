import java.util.*;
public class maxprodsubarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the elements of Array");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if (arr==null || arr.length==0){
            System.out.println("0");
        }
        int maxproduct=arr[0];
        int minproduct=arr[0];
        int result=arr[0];

        for (int i=1;i<n;i++){
            int num = arr[i];

            if(num<0){
                int temp = maxproduct;
                maxproduct = minproduct;
                minproduct = temp;

            }
        maxproduct= Math.max(num, maxproduct*num);
        minproduct= Math.min(num, minproduct*num);
        result = Math.max(result,maxproduct);
    }
    System.out.println(result);
    
}
}