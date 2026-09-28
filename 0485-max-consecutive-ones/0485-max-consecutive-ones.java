class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        int max = 0;
        int cnt = 0;
        while(right < n){
            if(nums[right] == 1){
                cnt = right-left+1;
                right++;
            }else{
                right++;
                left = right;
                cnt = 0;
            }
            max = Math.max(cnt, max);
        }

        return max;
    }
}