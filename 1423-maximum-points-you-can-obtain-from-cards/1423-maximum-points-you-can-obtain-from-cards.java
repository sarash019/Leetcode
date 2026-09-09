class Solution {
    public int maxScore(int[] nums, int k) {
        int n = nums.length;
        if(k == n){
            int sum = 0;
            for(var it : nums){
                sum += it;
            }
            return sum;
        }

        int max = 0;
        int left = 0;
        int right = n-1;
        int sum = 0;
        for(left = 0; left < k; left++){
            sum += nums[left];
        }
        System.out.println(sum);
        max = sum;
        left--;
        while(left <= k && right >= n-k){
            sum = sum - nums[left--] + nums[right--];
            System.out.print(sum + " ");
            max = Math.max(sum, max);
        }

        return max;
    }
}