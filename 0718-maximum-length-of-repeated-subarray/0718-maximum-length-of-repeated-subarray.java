class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int[][] dp = new int[l1+1][l2+1];
        for(var it : dp){
            Arrays.fill(it, 0);
        }
        int max = 0;

        for(int i = 0; i < l1; i++){
            for(int j = 0; j < l2; j++){
                if(nums1[i] == nums2[j]){
                    // System.out.println(":)");
                    dp[i+1][j+1] = dp[i][j] + 1; 
                }
                max = Math.max(max, dp[i+1][j+1]);
            }
        }

        return max;
    }
}