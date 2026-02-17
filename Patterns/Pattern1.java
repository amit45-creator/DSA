import java.util.Scanner;

public class pattern1 {
    static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* "); // print not println
            }
            System.out.println(); // new line after each row
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern1(n);
    }
}

