import java.util.*;
public class Pattern3 {
     static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt ();
        pattern3(n);
    }
}
