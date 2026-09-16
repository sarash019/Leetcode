class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        // int low = 0;
        // int high = n-1;
        // while(low < high){
        //     if(nums[low] == 0){
        //         int temp = nums[low];
        //         nums[low] = nums[high];
        //         nums[high] = temp;
        //         high--;
        //         low++;
        //     }else{
        //         low++;
        //     }
        // }
        int i = 0;
        int cnt = 0;
        for(int j = 0; j < n; j++){
            if(nums[j] == 0){
                cnt++;
            }else{
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        
    }
}