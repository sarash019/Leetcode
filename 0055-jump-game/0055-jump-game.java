class Solution {
    public boolean canJump(int[] nums) {

        if(nums.length <= 1)  return true;

        if(nums[0] == 0)  return false;

        int n = nums.length;
    
        int curr = 0;

        for(int i = 0; i < n; i ++){
            if(i > curr){
                return false;
            }

            curr = Math.max(curr, i+nums[i]);

            if(curr >= n-1){
                return true;
            }
        }

        return true;
        
    }
}