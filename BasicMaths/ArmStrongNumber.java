import java.util.*;
public class ArmStrongNumber {
    public boolean isArmStrong(int n){
        if (n<0) return false;
        int original=n;
        double sum=0;
        int digits = String.valueOf(n).length();
        while(n>0){
            int digit=n%10;
            sum=sum+Math.pow( digit, digits);
            n=n/10;
        }
        return original==sum;
    
}
public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int n=sc.nextInt();
    ArmStrongNumber sol=new ArmStrongNumber();
    boolean ans=sol.isArmStrong(n);
    if(ans==true){
        System.out.println(n+" is an Armstrong number");
    }
    else{
        System.out.println(n+" is not an Armstrong number");
    }
}}
