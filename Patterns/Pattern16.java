import java.util.*;

public class Pattern16 {
    static void pattern16(int n) {
          char ch = 'A';
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j <= i; j++) {

                System.out.print(ch + " ");

            }
           
            System.out.println(" ");
             ch++;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        pattern16(n);
        sc.close();
    }
}