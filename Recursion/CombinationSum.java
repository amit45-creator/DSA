import java.util.*;

public class CombinationSum {

    // ✅ Recursive helper function
    static void findCombinations(int index, int[] arr, int target, List<List<Integer>> result, List<Integer> ds) {
        if (index == arr.length) {
            if (target == 0) {
                result.add(new ArrayList<>(ds)); // Add valid combination
            }
            return;
        }

        // Pick the current element (if it doesn't exceed target)
        if (arr[index] <= target) {
            ds.add(arr[index]);
            findCombinations(index, arr, target - arr[index], result, ds); // Not increasing index (can reuse element)
            ds.remove(ds.size() - 1); // Backtrack
        }

        // Move to next index
        findCombinations(index + 1, arr, target, result, ds);
    }

    // ✅ Main combinationSum function
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        findCombinations(0, candidates, target, result, new ArrayList<>());
        return result;
    }

    // ✅ Main method for user input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target sum:");
        int target = sc.nextInt();

        List<List<Integer>> result = combinationSum(arr, target);

        System.out.println("Combinations that sum to " + target + ":");
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }

        sc.close();
    }
}
