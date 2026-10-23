class Solution {
    public int maxProduct(int[] nums) {
        // int maxpositive = 0;
        // int maxnegative = Integer.MIN_VALUE;
        // int zero = 0;
        // for(int it : nums){
        //     if(it > 0 && it >)
        // }
        int max = Integer.MIN_VALUE;
        int product = 1;
        for(int it : nums){
            product *= it;
            max = Math.max(max, product);
            if(product == 0)  product = 1;
        }

        product = 1;
        for(int i = nums.length-1; i >= 0; i--){
            product *= nums[i];

            max = Math.max(product, max);
            if(product == 0)  product = 1;
        }

        return max;
        
    }
}