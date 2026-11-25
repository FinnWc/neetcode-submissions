class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) {
            return 0;
        } else if(s.length() == 1) {
            return 1;
        }
        HashSet<Character> set = new HashSet<>();
        int q = 0;
        set.add(s.charAt(0));
        int p = 1;
        int maxLength = 1;
        while(p < s.length()) {
            if(set.contains(s.charAt(p))) {
                set.remove(s.charAt(q));
                q++;

            } else {
                set.add(s.charAt(p));
                maxLength = Math.max(p-q+1, maxLength);
                p++;
            }
        }
        return maxLength;
    }
}
