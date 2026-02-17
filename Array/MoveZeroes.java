// import java.util.*;

// public class MoveZeroes {
//     public void MoveZeroes(int[] arr) {
//         int[] temp = new int[arr.length];
//         int index = 0;

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] != 0) {
//                 temp[index] = arr[i];
//                 index++;
//             }
//         }
//         // copy back to original array
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = temp[i];
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = { 0, 1, 0, 3, 12 };
//         MoveZeroes sol = new MoveZeroes();

//         sol.MoveZeroes(arr);
//         System.out.print("Array after moving zeroes: ");
//         for (int num : arr) {
//             System.out.println(num + " ");
//         }

//     }
// }

//  now think of optimal approach 


public class MoveZeroes {
    // Function to move zeroes to the end
    public void moveZeroes(int[] nums) {
        // Pointer to the first zero
        int j = -1;

        // Find the first zero
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        // If no zero found, return
        if (j == -1)
            return;

        // Start from the next index of first zero
        for (int i = j + 1; i < nums.length; i++) {
            // If current element is non-zero
            if (nums[i] != 0) {
                // Swap with nums[j]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                // Move j to next zero
                j++;
            }
        }
    }


public static void main(String[] args) {
    MoveZeroes sol = new MoveZeroes();
    int[] nums = { 0, 1, 0, 3, 12 };
    sol.moveZeroes(nums);

    // Print the result
    for (int num : nums)
        System.out.print(num + " ");
    System.out.println();

}}

