class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int it : nums){
            if(it > 0){
                set.add(it);
            }
        }
        for(int i = 1; i < 10000000; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return 1;
    }
}