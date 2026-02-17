import java.util.*;

public class SubsetSum {
    // recursive function to find subsets
    public void findSubsets(int ind, int[] arr, List<Integer> ds, List<List<Integer>> ansList) {
        ansList.add(new ArrayList<>(ds));// add current subsets to answer list
        for (int i = ind; i < arr.length; i++) {
            if (i != ind && arr[i] == arr[i - 1])
                continue;
            // include the element
            ds.add(arr[i]);
            // recurse for next index
            findSubsets(i + 1, arr, ds, ansList);
            // Backtrack (remove last added element)
            ds.remove(ds.size() - 1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ansList = new ArrayList<>();
        findSubsets(0, arr, new ArrayList<>(), ansList);
        return ansList;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        SubsetSum obj = new SubsetSum();

        List<List<Integer>> ansList = obj.subsetsWithDup(arr);
        System.out.println("All unique subsets: ");
        
            for (List<Integer> subset : ansList){
                System.out.println(subset);
            }
                
        

    }

}
