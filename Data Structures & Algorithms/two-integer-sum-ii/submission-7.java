class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int p, q;
        p = numbers.length-1;
        q = 0;
        while(numbers[q] + numbers[p] != target) {
            if(numbers[q] + numbers[p] > target) {
                p--;
            } else {
                q++;
            }
        }
        return new int[]{++q,++p};
    }
}
