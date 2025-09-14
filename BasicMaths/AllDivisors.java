import java.util.*;

public class AllDivisors {
    static int[] divisors(int n) {
        if (n == 0)
            return new int[] {};
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        int[] arr = new int[count];
        int index = 0;

        for (int j = 1; j <= n; j++) {
            if (n % j == 0) {
                arr[index] = j;
                index++;
            }
        }
        return arr;
    }

    public static void main(String[] args) { // yaha par staic nhi liya kyuki humne class ko static nhi banaya hai
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        divisors(n);
        System.out.println("All divisors of " + n + " are: " + Arrays.toString(divisors(n)));

    }
}