import java.util.*;

public class Pattern10 {
    static void pattern10(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");

        }
    }

    static void pattern11(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        pattern10(n);
        pattern11(n);
        sc.close();
    }
}