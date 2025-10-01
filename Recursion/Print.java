
import java.util.*;
public class Print {
    static void function(int i,int N){
        if(i>N){
            return;
        }
        function(i+1,N);
        System.out.println(i);
    }
    public static void main(String[] args) {
         
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int N=sc.nextInt();
       
        function(1,N);
    }
}
