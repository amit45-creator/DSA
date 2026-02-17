// import java.util.*;
// public class SumofN {
//     static int sum(int n) {
//         // base case
//         if (n == 0) {
//             return 0;
//         }
//         return n + sum(n - 1);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int n = sc.nextInt();
//         int result = sum(n);
//         System.out.println("Sum of first " + n + " natural numbers is: " + result);
//         sc.close();
//     }
    
// }




//parameterized recursion
import java.util.*;

public class SumofN {
    static void sum(int i, int n, int sum) {
        // base case
        if (i == n) {
            sum += i;
            System.out.println("Sum is: " + sum);
            return;
        }
        sum += i;
        sum(i + 1, n, sum); // recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sum(1, n, 0); // initial call
        sc.close();
    }
    
}