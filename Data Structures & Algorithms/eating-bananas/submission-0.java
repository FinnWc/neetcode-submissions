class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < piles.length; i++) {
            max = Math.max(piles[i],max);
        }
        int hi = max;
        int lo = 1;
        int mid;
        int res = max;
        while(lo <= hi) {
            mid = lo + (hi - lo) / 2;
            long hours = 0;
            for(int i = 0; i < piles.length; i++) {
                hours += Math.ceil((double) piles[i] / mid);
            }
            if(hours <= h) {
                res = mid;
                hi = mid-1;
            } else {
                lo = mid + 1;
            }
        }
        return res;
    }
}
