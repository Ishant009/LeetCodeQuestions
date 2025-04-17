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
                str += sc;
                str = str.substring(str.indexOf(sc)+1, str.length());
            }
            if(str.length()>maxlen){
                maxlen= str.length();
            }
            map.put(sc, j);
            // System.out.println(map+"   "+ maxlen);
            
        }
        return maxlen;
    }
}