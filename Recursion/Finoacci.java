// import java.util.*;
// public class Finoacci {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number:");
//         int N = sc.nextInt();
//         int a = 0, b = 1;
//         System.out.print(a + " " + b + " ");
//         for (int i = 2; i < N; i++) {
//             int c = a + b;
//             System.out.print(c + " ");
//             a = b;
//             b = c;
//         }
//         sc.close();
//     }
// }



//using recursion
import java.util.*;
public class Finoacci {
    static int fib(int n) {
        if (n == 0) { // base case
            return 0;
        }
        if (n == 1) { // base case
            return 1;
        }
        return fib(n - 1) + fib(n - 2); // recursive case
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int N = sc.nextInt();
        System.out.print("Fibonacci series up to " + N + " terms: ");
        for (int i = 0; i < N; i++) {
            System.out.print(fib(i) + " ");
        }
        sc.close();
    }
    
}