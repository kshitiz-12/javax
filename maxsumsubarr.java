import java.util.*;
public class maxsumsubarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int a = sc.nextInt();
        int arr[] = new int[a];
        System.out.println("Enter elements of array:");
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        int n = arr.length;
        int suffixSum = arr[n - 1];

        // maxSuffix array to store the value of 
        // maximum suffix occurred so far.
        int[] maxSuffix = new int[n + 1];
        maxSuffix[n - 1] = arr[n - 1];

        for(int i = n - 2; i >= 0; i--) {
            suffixSum = suffixSum + arr[i];
            maxSuffix[i] = Math.max(maxSuffix[i + 1], suffixSum);
        }

        // circularSum is Maximum sum of circular subarray
        int circularSum = arr[0];

        // normalSum is Maximum sum subarray considering 
        // the array is non-circular
        int normalSum = arr[0];

        int currSum = 0;
        int prefix = 0;

        for(int i = 0; i < n; i++) {
            
            // Kadane's algorithm
            currSum = Math.max(currSum + arr[i], arr[i]);
            normalSum = Math.max(normalSum, currSum);
          
            // Calculating maximum Circular Sum
            prefix = prefix + arr[i];
            circularSum = Math.max(circularSum, prefix + maxSuffix[i + 1]);
        }

        int result= Math.max(circularSum, normalSum);
        System.out.println("Maximum sum of circular subarray is " + result);
       
    
    
}
}
