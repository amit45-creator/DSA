// import java.util.Scanner;

// public class PrimeNumber {
//     static String primeNumber(int n){
//         if(n<=1){
//             return "Not a prime number";
//         }
//         for(int i=2;i*i<=n;i++){
//             if(n%i==0){
//                 return "Not a prime number";
//             }
//         }
//         return "Prime number";
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a number:");
//         int n=sc.nextInt();
//         primeNumber(n);
//         System.out.println(primeNumber(n));

//     }

// }

//  OTHER WAY ALSO OPTIMAL AND FAST 
import java.util.Scanner;

public class PrimeNumber {
    static String primeNumber(int n){
        if(n<=1) return "not prime";
        if(n==2) return "prime";
        if (n%2==0) return "not prime";
        for(int i=3;i*i<=n;i+=2){
            return "it is a prime number";
        }
        return" not a prime ";

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        primeNumber(n);
        System.out.println(primeNumber(n));
       
    }
}
