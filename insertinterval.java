import java.util.*;
public class insertinterval {
    public static ArrayList<int[]> insertinterval(int[][]intervals,int[]newInterval){
        ArrayList<int[]> res = new ArrayList<>();
        int i=0;
        int n = intervals.length;
        while(i<n && intervals[i][1]< newInterval[0] ){
            res.add(intervals[i]);
            i++;
        }

        while (i<n && intervals[i][0] <= newInterval[1] ){
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;

        }
        res.add(newInterval);

        while (i<n){
            res.add(intervals[i]);
            i++;
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] intervals = { {1, 3}, {4, 5}, {6, 7}, {8, 10} }; 
        int[] newInterval = {5, 6};

        ArrayList<int[]> result = insertinterval(intervals, newInterval);

        System.out.print("Merged Intervals: ");
        for (int[] interval : result) {
            System.out.print("[" + interval[0] + ", " + interval[1] + "] ");
    }
    
}

}