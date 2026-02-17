public class RotateArrayByOne {

    public static void solve(int[] arr,int n){
        int [] temp=new int[n];

        for(int i=1;i<n;i++){
            temp[i-1]=arr[i];
        }
        temp[n-1]=arr[0];

        for(int i=0;i<n;i++){
            System.out.println(temp[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int n=5;
        int[] arr={1,2,3,4,5};
        RotateArrayByOne.solve(arr,n);
    }
}

//optimal approach  isme bas extra space nhi lag rha hai 
// public class RotateArrayByOne {
//     public void RotateArrayByOne(int[] nums) {
//         // Store the first element in a temporary variable
//         int temp = nums[0];

//         // Shift elements to the left
//         for (int i = 1; i < nums.length; i++) {
//             nums[i - 1] = nums[i];
//         }

//         // Place the first element at the end
//         nums[nums.length - 1] = temp;
//     }

//     public static void main(String[] args) {
//         RotateArrayByOne solution = new RotateArrayByOne();
//         int[] nums = { 1, 2, 3, 4, 5 };

//         solution.RotateArrayByOne(nums);

//         // output
//         for (int num : nums) {
//             System.out.print(num + " ");
//         }
//     }
// }
