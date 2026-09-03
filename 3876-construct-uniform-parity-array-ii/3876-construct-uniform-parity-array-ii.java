class Solution {
    public boolean uniformArray(int[] nums1) {

        int minE = 10000001;
        int minO = 10000000;

        for(int it : nums1){
            if(it%2 == 0){
                minE = Math.min(minE, it);
            }else{
                minO = Math.min(minO, it);
            }
        }

        if(minE == 10000001 || minO == 10000000)  return true;

        if(minE > minO){
            return true;
        }
        return false;
    }
}