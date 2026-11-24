class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sMapFreq = new HashMap<>();
        HashMap<Character, Integer> tMapFreq = new HashMap<>();
        for (char schar : s.toCharArray()) {
            if(sMapFreq.containsKey(schar)) {
                sMapFreq.put(schar, sMapFreq.get(schar) + 1);
            } else {
                sMapFreq.put(schar, 1);
            }
        } 
        for (char tchar : t.toCharArray()) {
            if(tMapFreq.containsKey(tchar)) {
                tMapFreq.put(tchar, tMapFreq.get(tchar) + 1);
            } else {
                tMapFreq.put(tchar, 1);
            }
        } 
        if(tMapFreq.equals(sMapFreq)) {
            return true;
        } else {
            return false;
        }
    }
}
