import java.util.*;

public class SumSubsequence {
    static void f(int index, int[] arr, int n, int target, List<Integer> ds, int sum) {
        // base case
        if (index == n) {
            if (sum == target) {
                System.out.println(ds); // print subsequence

            }
            return;
        }
        // pick the element

        ds.add(arr[index]);

        f(index + 1, arr, n, target, ds, sum + arr[index]);

        // not pick the element

        ds.remove(ds.size() - 1);

        f(index + 1, arr, n, target, ds, sum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target sum: ");
        int target = sc.nextInt();

        List<Integer> ds = new ArrayList<>();
        f(0, arr, n, target, ds, 0);

    }

}





               //   this is to print only one subsequence 

// import java.util.*;

// public class SumSubsequence {
    
//     static boolean f(int index, int[] arr, int n, int target, List<Integer> ds, int sum) {
//         // base case
//         if (index == n) {
//             if (sum == target) {
//                 System.out.println(ds); // print one valid subsequence
//                 return true; // stop recursion
//             }
//             return false;
//         }

//         // pick the element
//         ds.add(arr[index]);
//         if (f(index + 1, arr, n, target, ds, sum + arr[index])) {
//             return true; // if found, propagate true upward
//         }

//         // not pick the element
//         ds.remove(ds.size() - 1);
//         if (f(index + 1, arr, n, target, ds, sum)) {
//             return true;
//         }

//         return false; // no subsequence found in this path
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of array: ");
//         int n = sc.nextInt();
        
//         int[] arr = new int[n];
//         System.out.println("Enter elements: ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("Enter target sum: ");
//         int target = sc.nextInt();

//         List<Integer> ds = new ArrayList<>();
//         boolean found = f(0, arr, n, target, ds, 0);

//         if (!found) {
//             System.out.println("No subsequence found with sum = " + target);
//         }

//         sc.close();
//     }
// }





                // count the subsequence with sum k
// public class CountSubsequenceSumK {
//     static int countSubseq(int index, int[] arr, int sum, int k) {
//         // Base case
//         if (index == arr.length) {
//             return sum == k ? 1 : 0;
//         }

//         // Include current element
//         int left = countSubseq(index + 1, arr, sum + arr[index], k);

//         // Exclude current element
//         int right = countSubseq(index + 1, arr, sum, k);

//         return left + right;
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 1};
//         int k = 2;
//         System.out.println(countSubseq(0, arr, 0, k)); // Output = 2
//     }
// }



