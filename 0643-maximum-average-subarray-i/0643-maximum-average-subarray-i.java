class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int low = 0;
        int high = k-1;
        int sum = 0;
        for(int i = 0; i <= high; i++){
            sum += nums[i];
        }
        int maxSum = sum;
        high++;
        while(high < n){
            sum = sum - nums[low++];
            sum = sum + nums[high++];
            maxSum = Math.max(sum, maxSum);
        }

        return (double)maxSum/k;
    }
}