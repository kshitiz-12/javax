public class minelement {
    public static int minimum(int[]arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            min = Math.min(min, arr[i]);
    }
    return min;
}
public static void main(String[] args) {
    int[] arr = {5, 2, 8, 1, 9};
    System.out.println(minimum(arr));
}
    
}
