// import java.util.*;

// public class AllDivisors {
//     static int[] divisors(int n) {
//         if (n == 0)
//             return new int[] {};
//         int count = 0;
//         for (int i = 1; i <= n; i++) {
//             if (n % i == 0) {
//                 count++;
//             }
//         }
//         int[] arr = new int[count];
//         int index = 0;

//         for (int j = 1; j <= n; j++) {
//             if (n % j == 0) {
//                 arr[index] = j;
//                 index++;
//             }
//         }
//         return arr;
//     }

//     public static void main(String[] args) { // yaha par staic nhi liya kyuki humne class ko static nhi banaya hai
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number:");
//         int n = sc.nextInt();
//         divisors(n);
//         System.out.println("All divisors of " + n + " are: " + Arrays.toString(divisors(n)));

//     }
// }




//OPTIMAL APPROACH
import java.util.*;

class Solution {
    public int[] divisors(int n) {
        if (n == 0) return new int[]{};

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                arr.add(i); // i is a divisor
                if (i != n / i) { 
                    arr.add(n / i); // pair divisor
                }
            }
        }

        // sort because divisors from pairs may come unsorted
        Collections.sort(arr);

        // convert to int[]
        int[] result = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            result[i] = arr.get(i);
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        Solution solution = new Solution();
        int[] divisors = solution.divisors(n);
        System.out.println("All divisors of " + n + " are: " + Arrays.toString(divisors));
    }
}
