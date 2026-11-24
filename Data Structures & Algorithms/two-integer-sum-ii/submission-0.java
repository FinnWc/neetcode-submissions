class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int wants;
        for(int i = 0; i < numbers.length; i++) {
            wants = target - numbers[i];
            if(map.containsKey(numbers[i])) {
                return new int[]{map.get(numbers[i])+1, i+1};
            }
            map.put(wants, i);
        }
        return null;
    }
}
