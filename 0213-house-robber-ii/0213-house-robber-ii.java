class Solution {
    public int helper(int[] nums, int st, int end, int n){
        int[] dp = new int[n];

        dp[st] = nums[st];
        int neg = 0;
        int i = 0;
        for(i = st+1; i < end+1; i++){
            int take = nums[i];
            if(i > st+1)  take += dp[i-2];

            int nottake = 0 + dp[i-1];

            dp[i] = Math.max(take, nottake);

        }
        return dp[i-1];
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        if(n == 1)  return nums[0];
        int first = helper(nums, 0, n-2, n);
        int last = helper(nums, 1, n-1, n);
        System.out.println(first + " " + last);
        return Math.max(first, last);
    }
}