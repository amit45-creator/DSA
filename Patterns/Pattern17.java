import java.util.*;

public class Pattern17 {
    static void pattern17(int n) {
        for (int i = 0; i < n; i++) {
            char ch = 'A';
            for (int j = 0; j <= 2 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i + 1; j++) {
                if (j <= i + 1) {
                    System.out.print((char)('A' + j - 1));
                } else {
                    System.out.print((char)('A' + (2 * i + 1 - j)));
                }
            }
            for (int j = 0; j <= 2 - i; j++) {
                System.out.print(" ");
            }
            System.out.println(" ");

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        pattern17(n);
    }

}