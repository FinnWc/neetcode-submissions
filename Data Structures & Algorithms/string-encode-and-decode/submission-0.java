
class Solution {

    public String encode(List<String> strs) {
        if(strs == null || strs.isEmpty()) {
            return "";
        }
        List<Integer> sizes = new ArrayList<>();
        for(String str : strs) {
            sizes.add(str.length());
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < sizes.size()-1; i++) {
            sb.append(sizes.get(i) + ",");
        }
        sb.append(sizes.get(sizes.size()-1) + "#");
        for(String str : strs) {
            sb.append(str);
        }
        return sb.toString();
    }
    //[this,is,my,jawn] = 4,2,2,4#thisismyjawn
    public List<String> decode(String str) {
        List<Integer> sizes = new ArrayList<>();
        int hi = 0;
        int low = 0;
        if(str == null || str.isEmpty()) {
            return new ArrayList<>();
        }
        while(str.charAt(hi) != '#') {
            while(str.charAt(hi) != ',' && str.charAt(hi) != '#') {
                hi++;
            }
            int size = Integer.parseInt(str.substring(low,hi));
            sizes.add(size);
            if(str.charAt(hi) == '#') {
                hi++;
                break;
            }
            low = ++hi;
        }
        List<String> decoded = new ArrayList<>();
        for(int size : sizes) {
            decoded.add(str.substring(hi,hi + size));
            hi += size;
        }
        return decoded;
    }
}
