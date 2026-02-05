// import java.util.Arrays;

// public class CheckArrayIsSorted {
//     // Function to check if the array is sorted
//     public boolean isSorted(int[] arr, int n) {
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 // If any element is smaller than the previous one, return false
//                 if (arr[j] < arr[i])
//                     return false;
//             }
//         }
//         return true; // Return true if no unsorted elements are found
//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 3, 4, 5 };
//         int n = 5;
//         CheckArrayIsSorted obj = new CheckArrayIsSorted();

//         boolean ans = obj.isSorted(arr, n);

//         // Output result
//         if (ans)
//             System.out.println("True");
//         else
//             System.out.println("False");
//     }
// }


//optimal
import java.util.Arrays;
public class CheckArrayIsSorted{
        // Function to check if the array is sorted
    public boolean isSorted(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1])  // If any element is smaller than the previous one, return false
                return false;
        }
        return true;  // Return true if the array is sorted
    }



    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        CheckArrayIsSorted obj = new CheckArrayIsSorted();
        
        // Output result
        System.out.println(obj.isSorted(arr, n) ? "True" : "False");
    }
}