class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int i =0;
        int j=0;
        String str = "";
        int maxlen = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(j=0;j<s.length();j++){
            char sc = s.charAt(j);
            if(!str.contains(sc+"")){
                str+=sc;
            }else{
                i = map.get(sc);
                str+=sc;
                str = s.substring(i, j);
            }
            maxlen= Math.max(str.length(), maxlen);
            map.put(sc, j);
            
        }
        return maxlen;
    }
}