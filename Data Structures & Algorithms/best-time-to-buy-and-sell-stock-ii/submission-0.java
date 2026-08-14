class Solution {
    public int maxProfit(int[] prices) {
        int res =0;
        int small = prices[0];
        for(int i =1;i<prices.length;i++){
            small = Math.min(small,prices[i]);
            if(prices[i]>small){
                res+=prices[i]-small;
                small = prices[i];
            }
        }
        return res;
    }
}