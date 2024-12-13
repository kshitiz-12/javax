import java.util.*;
public class mergeindex {
    public static int [][] merge(int [][] arr) {
        if(arr.length==0){
            return new int[0][0];
        }
        int index=0;
        Arrays.sort(arr, (a,b)->Integer.compare(a[0], b[0]));
        for(int i=1;i<arr.length;i++){
            if(arr[index][1]>=arr[i][0]){
                arr[index][1]=Math.max(arr[index][1], arr[i][1]);
            }
            else{
                index++;
                arr[index]=arr[i];
            }
        }
        return Arrays.copyOfRange(arr, 0, index+1);
    
    }
    public static void main(String[] args) {
        int[][] arr = { { 1, 3 }, { 2, 6 },{5,8},{10,12}};
        int[][] merged = merge(arr);
        for (int[] inter:merged){
            System.out.println(Arrays.toString(inter));
        }
    }
}