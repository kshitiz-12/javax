import java.util.Arrays;

public class mergewithoutspace {
    public static void mergewidsp(int[]a,int[]b){
        int n = a.length;
        int m= b.length;
        int i = 0;
        while (i<n){
            
            if(a[i]>b[0]){
                int temp = a[i];
                a[i]=b[0];
                b[0]=temp;
             
             int first = b[0];
             int k;
             for ( k=1;k<m&&b[k]<first;k++){
                
                    b[k-1]=b[k];
                

             }
             b[k-1]=first;
        }
        i++;
    }

    
}
public static void main(String[] args) {
    int a[]={1,3,5,7};
    int b[]={2,4,6,8};
        mergewidsp(a,b);
    System.out.println(Arrays.toString(a));
    System.out.println(Arrays.toString(b));
}
}
