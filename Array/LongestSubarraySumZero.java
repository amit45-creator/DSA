//import java.util.*;

// public class LongestSubarraySumZero {
//     public int longestSubarray(int[] arr) {
//         int n = arr.length;
//         int maxLen = 0;
//         for (int i = 0; i < n; i++) {
//             int sum = 0;
//             for (int j = i; j < n; j++) {
//                 sum += arr[j];
//                 if (sum == 0) {
//                     maxLen = Math.max(maxLen, j - i + 1);
//                 }
//             }
//         }
//         return maxLen;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 9, -3, 3, -1, 6, -5 };

//         LongestSubarraySumZero obj = new LongestSubarraySumZero();
//         int ans = obj.longestSubarray(arr);
//         System.out.println("the longest subarray sum is: " + ans);

//     }

// }

// optimal approach
import java.util.*;

public class LongestSubarraySumZero {
    public int longestSubarray(int[] arr) {
        int maxLen = 0;
        Map<Integer, Integer> sumIndexMap = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0) {
                maxLen = i + 1;

            } else if (sumIndexMap.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - sumIndexMap.get(sum));
            } else {
                sumIndexMap.put(sum, i);
            }
        }
        return maxLen;

    }

    public static void main(String[] args) {

        int[] arr = { 9, -3, 3, -1, 6, -5 };

        LongestSubarraySumZero obj = new LongestSubarraySumZero();
        int ans = obj.longestSubarray(arr);
        System.out.println("the longest subarray sum is: " + ans);

    }
}