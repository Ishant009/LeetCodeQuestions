class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxCount=Integer.MIN_VALUE;
        int count=0;
        int l=0;
        int h=0;
        int i=0;
        if(s.length()<=1) return s.length();
        while(l<s.length()){
            Set<Character> set = new HashSet<>();
             while(h<s.length() && !set.contains(s.charAt(h)) ){
                    set.add(s.charAt(h));
                    count++;
                    h++; 
            }
            maxCount = Math.max(count, maxCount);
                h=l;
                count=0;
                set.clear();   
            l++;
        
        }
        return maxCount==Integer.MIN_VALUE? 0: maxCount;
    }
}