class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int len = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        for(int right = 0; right < n; right++){
            sum += nums[right];

            while(sum >= target){
                len = Math.min(len, right-left+1);
                sum -= nums[left];
                left++;
            }
        }
        if(len == Integer.MAX_VALUE){
            return 0;
        }else{
            return len;
        }

        // int maxIndex = 0;
        // for(int i = 0; i < n-1; i++){
        //     if(nums[i] < nums[i+1]){
        //         maxIndex = i+1;
        //     }
        // }
        // if(nums[maxIndex] >= target)  return 1;
        // int
    }
}