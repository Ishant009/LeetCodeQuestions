class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxCount=Integer.MIN_VALUE;
        int count=0;
        int l=0;
        int h=0;
        int i=0;
        String sb="";
        if(s.length()<=1) return s.length();
        while(l<s.length()){
             while(h<s.length() && !sb.contains(s.charAt(h)+"") ){
                    // sb.add(s.charAt(h));
                    sb+=s.charAt(h);
                    count++;
                    h++; 
            }
            maxCount = Math.max(count, maxCount);
                h=l;
                count=0;
                sb="";
            l++;
        
        }
        return maxCount==Integer.MIN_VALUE? 0: maxCount;
    }
}