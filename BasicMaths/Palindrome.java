import java.util.*;
public class Palindrome {
    public boolean isPalindrome(int n){
        if (n<0){
            return false;
        }
        int original=n;
        int rev=0;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        return rev==original;
    }
    
public static void main (String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number:");
    int n=sc.nextInt();

    Palindrome sol = new Palindrome();
    boolean ans= sol.isPalindrome(n);
    if(ans==true){
        System.out.println(n+" is a Palindrome number");
    }
    else{
        System.out.println(n+" is not a Palindrome number");
    }

}}