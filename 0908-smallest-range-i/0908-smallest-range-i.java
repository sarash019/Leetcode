class Solution {
    public int smallestRangeI(int[] nums, int k) {

        if(nums.length == 1)  return 0;
        int ans = 100000;
        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();

        if(Math.abs(max - min) <= k)  return 0;

        if(k == 0)  return max - min;

        max = max - k;
        min = min + k;
        int i = 0;
        while(i < k){
            int diff = Math.abs(max - min);
            ans = Math.min(diff, ans);
            if(max > min){
                max++;
            }else{
                min--;
            }
            i++;
        }

        return ans;
    }
}