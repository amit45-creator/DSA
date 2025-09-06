import java.util.*;

public class Pattern15 {
    static void pattern15(int n) {
               
        for (int i = n; 0 < i; i--) {
             char ch='A';
            for (int j = 0; j < i; j++) {
            
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
        pattern15(n);
        sc.close();
    }
}