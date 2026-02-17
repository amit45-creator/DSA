import java.util.*;

public class MergeSort {
    static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;

        mergeSort(arr, low, mid); // left half
        mergeSort(arr, mid + 1, high); // right half
        merge(arr, low, mid, high); // merging both

    }

    static void merge(int[] arr, int low, int mid, int high) {
        int temp[] = new int[high - low + 1];
        int i = low, j = mid + 1, k = 0;
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        // remaining elements

        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= high) {
            temp[k++] = arr[j++];
        }

        // copy sorted elements back to original array
        for (int p = 0; p < temp.length; p++) {
            arr[low + p] = temp[p];
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int low = 0;
        int high = arr.length - 1;

        mergeSort(arr, low, high);
        // System.out.println("Sorted array: " + Arrays.toString(arr));
        // alternatively 
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();

    }

}
