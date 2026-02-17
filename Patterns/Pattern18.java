import java.util.*;

public class Pattern18 {
    public static void pattern18(int n) {
        for (int i = 1; i<=n; i++) {
            char ch = 'A';
            int m=i;
            for (int j = 1; j <= i; j++) {

                System.out.print((char) ('A'+n-m));
                m--;
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        pattern18(n);
    }
}
