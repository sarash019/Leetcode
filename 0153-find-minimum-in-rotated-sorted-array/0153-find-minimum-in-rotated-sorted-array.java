class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int min = Math.min(nums[left], nums[right]);
        while(left <= right){
            if(nums[left] > nums[right]){
                left++;
                min = Math.min(min, nums[left]);
            }else if(nums[left] < nums[right]){
                right--;
                min = Math.min(min, nums[right]);
            }else{
                left++;
                right--;
                // min = Math.min(nums[left], nums[right]);
            }
        }

        return min;
    }
}