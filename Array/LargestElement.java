// import java.util.Arrays;
// public class LargestElement {
//     public static int sortArr(int[] arr){
//         Arrays.sort(arr);

//         return arr[arr.length-1];
        
//     }

// public static void main (String[]args){
//     int[]arr1={2,5,1,3,0};
//     System.out.println("The largest element  is : " + LargestElement.sortArr(arr1));
// }}

// optimal approach 
import java.util.Arrays;
public class LargestElement{
   public static int findLargestElement(int[]arr,int n){
    int max=arr[0];
    for(int i=1; i<n;i++){
        if(arr[i]> max){
            max=arr[i];
        }
    }
    return max;
   }

public static void main(String[] args){
    int[] arr1={2,5,1,3,0};
    int n =arr1.length;
    int max=LargestElement.findLargestElement(arr1, n);
    System.out.println("the largest element is : " + max);
}}