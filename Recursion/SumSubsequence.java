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
