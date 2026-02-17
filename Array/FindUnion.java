// import java.util.*;
// public class FindUnion {

//     public List<Integer>FindUnion(int []arr1,int[]arr2){

//         //create a treeset to store unique sorted elements
//         Set<Integer> st=new TreeSet<>();

//         for(int num: arr1){
//             st.add(num);

//         }
//         for(int num:arr2){
//             st.add(num);
//         } 
//         //  convert set to list
//         return new ArrayList<>(st);
//     }
//     public static void main(String[] args) {
//         int[] arr1={1,2,3,4,5,6,7,8,9,10};
//         int[] arr2={2,3,4,4,5,11,12};

//         FindUnion obj=new FindUnion();
//         List<Integer> result =obj.FindUnion(arr1,arr2);
//         System.out.println("union of arr1 and arr2 is:"); 
//         for(int val: result){
//             System.out.println(val+" ");

//         }
//     }
// }



//optimal approach, assignement for yourself two pointer approach
import java.util.*;

public class FindUnion {
    public List<Integer> findUnion(int[] arr1, int[] arr2, int n, int m) {
        // List to store union elements
        List<Integer> Union = new ArrayList<>();

        int i = 0, j = 0;
        // Iterate while both arrays have elements
        while (i < n && j < m) {
            // if element in arr1 is smaller
            if (arr1[i] < arr2[j]) {
                // add if empty or not dupliacte
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
            }
            // if element in arr2 is smaller
            else if (arr2[j] < arr1[i]) {
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr2[j]) {
                    Union.add(arr2[j]);
                    j++;
                }
            } else {
                // elements are equal add once if not duplicate
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i]) {
                    Union.add(arr1[i]);
                    i++;
                    j++;
                }
            }
            // append remaining elements froma rr1 and arr2
            // Append remaining elements from arr1
            while (i < n) {
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
            }

            // Append remaining elements from arr2
            while (j < m) {
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr2[j])
                    Union.add(arr2[j]);
                j++;
            }

        }
        // Return the union list
        return Union;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] arr2 = { 2, 3, 4, 5, 11, 12 };
        int n = arr1.length, m = arr2.length;
        FindUnion obj = new FindUnion();
        List<Integer> result = obj.findUnion(arr1, arr2, n, m);
        System.out.println("union of two arrays is : ");
        for (int val : result) {
            System.out.println(val + " ");
        }

    }

}
