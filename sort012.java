import java.util.*;
public class sort012 {
    public static  int [] sort(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        int temp = 0;
        while (mid <= high) {
        if (arr[mid] == 0) {
            swap(arr,mid,low);{
                low++;
                mid++;
                }
            }
            else if (arr[mid] == 1) {
                mid++;
                }
            else{
                swap(arr,mid,high);
                high--;
            }
            
        }
        return arr;

        
    }
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1,};
        sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
    }

    
}
}
