import java.util.*;
public class Permutation1 {
    private static void recurPermute(int[]nums,List<Integer>ds,List<List<Integer>>ans,boolean []freq){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                ds.add(nums[i]);
                recurPermute(nums,ds,ans,freq);
                ds.remove(ds.size()-1);
                freq[i]=false;
                
            }
        }
    }
    public static List<List<Integer>> permute(int[]nums){
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        boolean freq[] =new boolean [nums.length];
        recurPermute(nums,ds,ans,freq);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int [] nums=new int[n];
        System.out.println("Enter the  elements of array: ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        permute(nums);
        System.out.println("All permutations are: ");
        for(List<Integer> perm: permute(nums)){
            System.out.println(perm);
        }
    }

    
}
