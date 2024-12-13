import java.util.*;
public class rough {
    public static void main(String[] args) {
        ArrayList<int[]> result = new ArrayList<>();

        int i = 0; 
        
        int[][] intervals = { {1, 3}, {4, 5}, {6, 7}, {8, 10} };
        int[] newInterval = {4, 6};
        
        int n = intervals.length;
        while (i < n && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
           
           
            
            i++;
        }
        System.out.println(i);
        
      //
        //System.out.println((intervals[1][2]));
        
        

        
    }
    
}
