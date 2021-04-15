import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums,int target){
        int n=nums.length;
        for (int i = 0; i < n; i++) {
            for (int j=i+1;i<n;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }

        }
        return new int[0];
    }
    public int[] twoSum2(int[] nums,int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            if (numMap.containsKey(target-nums[i])) {
                return new int[]{numMap.get(target-nums[i]), i};
            }
            numMap.put(nums[i],i);

        }
        return new int[0];
    }


    public static void main(String[] args) {
        TwoSum twoSum=new TwoSum();
        int nums[]={1,2,3,4,5,19};
        int target=20;
        System.out.println(twoSum.twoSum2(nums,target)[0]);
        System.out.println(twoSum.twoSum2(nums,target)[1]);
    }
}
