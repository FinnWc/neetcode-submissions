class Solution {
    public int search(int[] nums, int target) {
        int q = 0;
        int p = nums.length-1;
        int index = -1;
        int mid;
        while(q <= p) {
            mid = q + (p - q) / 2;
            if(nums[mid] == target) {
                index = mid;
                break;
            } else if(target < nums[mid]) {
                p = mid-1;
            } else if(target > nums[mid]) {
                q = mid+1;
            }
        }
        return index;
    }
}
