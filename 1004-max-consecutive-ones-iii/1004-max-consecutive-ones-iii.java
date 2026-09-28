class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int max = 0;
        int left = 0;
        int right = 0;
        int cnt = 0; 

        while (right < n) {
            if (nums[right] == 0) {
                cnt++;
            }

            while (cnt > k) {
                if (nums[left] == 0) {
                    cnt--; 
                }
                left++; 
            }

            int len = right - left + 1;
            max = Math.max(max, len);

            right++;
        }
        return max;
    }
}
