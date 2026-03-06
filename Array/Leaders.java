
import java.util.*;

public class Leaders {


    // brute force approach
    // public ArrayList<Integer> leaders(int[] nums) {
    //     ArrayList<Integer> ans = new ArrayList<>();
    //     for (int i = 0; i < nums.length; i++) {
    //         boolean leader = true;
    //         for (int j = i + 1; j < nums.length; j++) {
    //             if (nums[j] > nums[i]) {
    //                 leader = false;
    //                 break;
    //             }
    //         }
    //         if (leader) {
    //             ans.add(nums[i]);
    //         }
    //     }
    //     return ans;
    // }



    // optimal approach
      public ArrayList<Integer> leaders(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        if (nums.length == 0) {
            return ans;
        }
        
        // Last element of the array is always a leader
        int max = nums[nums.length - 1];
        ans.add(nums[nums.length - 1]);
        
        // Check elements from right to left
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > max) {
                ans.add(nums[i]);
                max = nums[i];
            }
        }
        
        /* Reverse the list to match
        the required output order */
        Collections.reverse(ans);
        
        // Return the leaders
        return ans;
    }


    public static void main(String[] args) {

        int[] nums = { 10, 22, 12, 3, 0, 6 };

        Leaders obj = new Leaders();

        ArrayList<Integer> ans = obj.leaders(nums);

        System.out.println("Leaders are:");

        for (int leader : ans) {
            System.out.print(leader + " ");
        }

    }
}