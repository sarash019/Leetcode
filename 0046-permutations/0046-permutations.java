import java.util.ArrayList;
import java.util.List;

class Solution {

    public void helper(int[] nums, int index, List<List<Integer>> ans){
        if(index == nums.length){
            List<Integer> currentPermutation = new ArrayList<>();
            for (int num : nums) {
                currentPermutation.add(num);
            }
            ans.add(currentPermutation);
            return;
        }

        for(int i = index; i < nums.length; i++){
            int temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;

            helper(nums, index + 1, ans);

            temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, 0, ans);
        return ans;
    }
}
