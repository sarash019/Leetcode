class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        while(left <= right){
            if(target == nums[left] || target == nums[right]){
                return true;
            }
            else{
                right--;
                left++;
            }
        }
        return false;
    }
}