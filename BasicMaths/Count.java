

import java.util.*;
class Count {
    public static int countDigit(int n) {
       if(n==0) return 1;
       int count=0;
       while(n>0){
        
        n=n/10;
        count++;
       }
       return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n =sc.nextInt();
         int digits=countDigit(n);
         System.out.println("Number of digits: " + digits); 
        sc.close();

        
    }
}
