import java.util.Scanner; 
public class Factorial {
    static int factorial(int N) {
        if(N==1 || N==0){ //base case
            return 1;
        } else { //recursive case
            return N * factorial(N-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int N = sc.nextInt();
         factorial(N);
        System.out.println("Factorial of " + N + " is: " + factorial(N));
    }
    
}
