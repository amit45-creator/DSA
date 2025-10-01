import java.util.*;

public class SumN {
    static int sum(int n) {
        if (n == 0) {    // base case
            return 0;
        }
        return n + sum(n - 1);   // recursive case
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int N = sc.nextInt();

        int result = sum(N);
        System.out.println("Sum of first " + N + " numbers is: " + result);
    }
}

