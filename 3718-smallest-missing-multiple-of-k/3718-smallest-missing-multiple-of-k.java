class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        for(int i = 1; i <= (nums.length*k)+k; i++){
            if(!set.contains(k*i)){
                return k*i;
            }
        }

        return 0;
    }
}