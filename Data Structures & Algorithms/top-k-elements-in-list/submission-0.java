class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer,Integer>> freq = new ArrayList<>(map.entrySet());
        freq.sort((a,b) -> b.getValue() - a.getValue());
        int[] ans = new int[k];
        for(int i = 0; i < k; i++) {
            ans[i] = freq.get(i).getKey();
        }
        return ans;
    }
}
