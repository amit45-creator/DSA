// public class MissingNum {
//     public static int missingNum(int[] arr){
//         int n=arr.length+1;
//         for(int i=1;i<n;i++){
//             boolean found=false;
//             for(int j=0;j<n-1;j++){
//                 if(arr[j]==i){
//                     found=true;
//                     break;
//                 }

//             }
//             if(!found)
//                 return i;
//         }
//         return -1;
//     }
//   public static void main(String[] args) {
//     int [] arr={8,2,4,5,3,7,1};
//     System.out.println(missingNum(arr));
//   }
    
// }


public class MissingNum {
    public static int missingNum(int[] arr){
        int n=arr.length+1;
        long sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        long expSum=n*(n+1) /2;
        return (int)(expSum-sum);

    }
    public static void main(String[] args) {
        int [] arr={8,2,4,5,3,7,1};
        System.out.println(missingNum(arr));
    }
}