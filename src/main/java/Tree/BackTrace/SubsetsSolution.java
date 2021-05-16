package src.main.java.Tree.BackTrace;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SubsetsSolution {
    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> res=new ArrayList<>();
        backtrack(0,nums,res,new ArrayList<Integer>());
        return res;
    }
    public void backtrack(int i,int[] nums,List<List<Integer>> res,ArrayList<Integer> tmp){
        res.add(new ArrayList<>(tmp));
        for(int j=i;j<nums.length;j++){
            tmp.add(nums[j]);
            backtrack(j+1,nums,res,tmp);
            tmp.remove(tmp.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] nums={6,7,8,9};
        SubsetsSolution s=new SubsetsSolution();
        System.out.println(s.subsets(nums));
       
        
    }

}
