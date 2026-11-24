class Solution {
    public int findMin(int[] nums) {
        int res = Arrays.stream(nums).min().getAsInt();
        return res;
    }
}
