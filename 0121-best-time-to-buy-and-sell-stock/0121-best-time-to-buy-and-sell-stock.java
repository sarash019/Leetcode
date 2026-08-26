class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int minp = 1000000;

        for(int price : prices){
            if(price < minp){
                minp = price;
            }else{
                maxprofit = Math.max(maxprofit, price-minp);
            }
        }
        return maxprofit;
    }
}