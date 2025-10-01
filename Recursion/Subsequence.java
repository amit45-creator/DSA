import java.util.*;
public class Subsequence {
    static void f(int index,int[] arr,ArrayList<Integer>ds){
        //base case

        if (index==arr.length){
            System.out.println(ds);  // print current subsequence 
            return ;

        }
          // include the element 
           ds.add(arr[index]);
           f(index+1,arr,ds);

           //backtrack (remove last added element)
           ds.remove(ds.size()-1);

           // exclude the element 
           f(index+1,arr,ds);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        ArrayList<Integer> ds= new ArrayList<>();
        f(0,arr,ds);  // start recursion
    }
}
