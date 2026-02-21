// import java.util.*;
// public class LongestSubarraySum {

//     public int longestSubarray(int[]arr, int k){
//         int n=arr.length;
//         int maxLength=0;
//         for(int i=0;i<n;i++){
//             for (int j=i;j<n;j++){
//                 int sum=0;
//                 for(int l = i;l<=j;l++){
//                     sum+=arr[l];
//                 }
//                 if(sum==k){
//                     maxLength=Math.max(maxLength,j-i+1);
//                 }
//             }
//         }
//         return maxLength;
//     }

//     public static void main(String[] args) {
        
//         int [] arr={-1,1,1};
//         int k=1;
//         //create instance of the Solution class
//         LongestSubarraySum obj=new LongestSubarraySum();

//         //function call to get the result 
//         int len=obj.longestSubarray(arr,k);
//         System.out.println("The length of the longest subarray is: " +  len);

//     }
// }



//optimal approach 
import java.util.*;
public class LongestSubarraySum{
    public int longestSubarray(int[]arr,int k){
        int n=arr.length;
        int maxLen=0;
        int left=0;
        int right=0;
        int sum=arr[0];
        while(right<n){
            while(left<=right&& sum>k){
                sum-=arr[left];
                left++;
            }
            if (sum==k){
                maxLen=Math.max(maxLen,right-left+1);
            }
            right++;
            if(right<n){
                sum+=arr[right];
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int []  arr={-1,1,1};
        int k=1;
         LongestSubarraySum obj=new LongestSubarraySum();
        int len=obj.longestSubarray(arr,k);
        System.out.println("the length of the longest subarray is:"+len);

        
    }
}
