class Solution {
    public int findMin(int[] nums) {
        int hi = nums.length-1;
        int low = 0;
        int mid;
        int min = Integer.MAX_VALUE;
        while(low < hi) {
            mid = low + (hi - low) / 2;
            if(nums[mid] > nums[hi]) {
                low = mid + 1;
            } else {
                hi = mid;
            }
        }
        return nums[low];
    }
}
