public class occurrencee {
    public static int occu(int[]arr,int target){
        int n= arr.length;
        int count=0;
        for(int i = 0;i<n;i++){
            if(arr[i]==target){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3,2,2,2,2};
        int target = 2;
        System.out.println(occu(arr, target));
    }
    
}
