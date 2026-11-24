class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1) {
            return 0;
        }
        int lowestSoFar = prices[0];
        int maxValue = 0;

        for(int i = 1; i < prices.length; i++) {
            if(lowestSoFar < prices[i])
                maxValue = Math.max(maxValue, prices[i] - lowestSoFar);
            lowestSoFar = Math.min(lowestSoFar, prices[i]);
        }
        return maxValue;
    }
}
