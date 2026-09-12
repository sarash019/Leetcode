class Solution {
    public int rob(int[] nums) {
        // Simple tabulation
        int n = nums.length;
        int[] dp = new int[n];

        dp[0] = nums[0];
        int neg = 0;
        int i = 0;
        for(i = 1; i < n; i++){
            int take = nums[i];
            if(i > 1)  take += dp[i-2];

            int nottake = 0 + dp[i-1];

            dp[i] = Math.max(take, nottake);

        }
        return dp[i-1];
    }
}