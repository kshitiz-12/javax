import java.util.Scanner;

public class convertintoint {
    public static int customAtoi(String s) {
        int INT_MAX = Integer.MAX_VALUE;
        int INT_MIN = Integer.MIN_VALUE;

        int i = 0, n = s.length();
        int result = 0;
        int sign = 1;

        System.out.println("Input string: \"" + s + "\"");

        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            

            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? INT_MAX : INT_MIN;
            }

            result = result * 10 + digit;
            System.out.println("Current result: " + result);
            i++;
        }

        
        return result * sign;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int result = customAtoi(input);
        System.out.println("Converted integer: " + result);

        scanner.close();
    }
}
