import java.util.*;

public class Pattern14 {
    static void pattern14(int n) {
               
        for (int i = 0; i < n; i++) {
             char ch='A';
            for (int j = 0; j <= i; j++) {
            
                System.out.print(ch+" ");
              ch++;
            }
            System.out.println(" ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        pattern14(n);
        sc.close();
    }
}