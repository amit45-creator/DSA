//  two pointer approach
// import java.util.*;

// public class ReverseAnArray {
//     static int[] reverse(int arr[]) {
//         int start = 0, end = arr.length - 1;
//         while (start < end) {
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }
//         return arr;

//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of the array:");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();

//         }
//         reverse(arr);
//         System.out.println("Reversed array is:"+Arrays.toString(arr));
//         sc.close();
//     }

// }






// using recursion 

import java.util.*;

public class ReverseAnArray {
    static void reverse(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int l = 0;
        int r = arr.length - 1;
        reverse(arr, l, r);
        System.out.println("Reversed array is:" + Arrays.toString(arr));
        sc.close();
    }

}
// can we do using single variable yes we can do using single variable