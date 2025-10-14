import java.util.*;

public class Combination2 {
    static void findCombinations(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = ind; i < arr.length; i++) {
            if (arr[i] > target)
                break;

            if(i>ind && arr[i]==arr[i-1]) continue;

            ds.add(arr[i]);
            findCombinations(i + 1, arr, target - arr[i], ans, ds);
            ds.remove(ds.size() - 1);
        }
    }

    public static List<List<Integer>> CombinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the target sum :");
        int target = sc.nextInt();

        List<List<Integer>> ans = CombinationSum(arr, target);
        System.out.println("Combinations that sum to " + target + ":");
        for (List<Integer> combination : ans) {
            System.out.println(combination);
        }
        sc.close();

    }

}

// for better clarity rewatch the video lecture 11 recursion combination second
