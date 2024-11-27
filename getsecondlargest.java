import java.util.*;

public class getsecondlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter  elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int first = -1;
        int second = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        
        if (second == -1) {
            System.out.println("-1 (No second largest element)");
        } else {
            System.out.println("The second largest element is: " + second);
        }
    }
}

            


