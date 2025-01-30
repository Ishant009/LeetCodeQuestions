class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        for(int i=0;i<prices.length-1;i++){
            int min = prices[i+1]-prices[i];
            if(min>0){
                max += min;
            }
        }
        return max;
    }
}