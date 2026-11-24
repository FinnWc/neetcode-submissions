class Solution {
    public int maxProfit(int[] prices) {
        int lowestSoFar = prices[0];
        int maxValue = 0;

        for(int i = 1; i < prices.length; i++) {
            maxValue = Math.max(maxValue, prices[i] - lowestSoFar);
            lowestSoFar = Math.min(lowestSoFar, prices[i]);
        }
        return maxValue;
    }
}
