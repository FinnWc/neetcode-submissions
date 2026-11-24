class Solution {
    public boolean isPalindrome(String s) {
        int p = s.length()-1;
        int q = 0;
        boolean yes = true;
        while(q < p) {
            while(q < p && !Character.isLetterOrDigit(s.charAt(q))) {
                q++;
            }
            while(q < p && !Character.isLetterOrDigit(s.charAt(p))) {
                p--;
            }
            if(Character.toLowerCase(s.charAt(q)) != Character.toLowerCase(s.charAt(p))) {
                yes = false;
                break;
            }
            p--;
            q++;
        }
        if(yes) {
            return true;
        } else {
            return false;
        }
    }
}
