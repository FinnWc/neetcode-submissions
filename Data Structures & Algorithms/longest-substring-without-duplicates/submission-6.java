class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int temp = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            map.clear();
            map.put(s.charAt(i),1);
            maxLength = Math.max(maxLength, 1);
            for(int j = i+1; j < s.length(); j++) {
                if(map.containsKey(s.charAt(j))) {
                    maxLength = Math.max(j-i, maxLength);
                    break;
                }
                map.put(s.charAt(j),1);
                maxLength = Math.max(j-i+1,maxLength);
                temp = j;
            }
            maxLength = Math.max(temp-i+1,maxLength);
        }
        return maxLength;
    }
}
