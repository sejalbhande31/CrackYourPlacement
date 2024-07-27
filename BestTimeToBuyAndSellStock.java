class Solution {
    public int maxProfit(int[] prices) {
       int maxVariable= 0;
       int minPrice = Integer.MAX_VALUE;

       for(int i=0;i<prices.length;i++){
        minPrice=Math.min(minPrice,prices[i]);
        maxVariable = Math.max(maxVariable, prices[i]-minPrice);
       }
       return maxVariable;
    }
}