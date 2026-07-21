class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxCount=Integer.MIN_VALUE;
        int count=0;
        int l=0;
        int i=0;
        int res = Integer.MIN_VALUE;
        Map<Character, Integer> map = new HashMap<>();

        for(int h=0; h<s.length(); h++){
            map.put(s.charAt(h), map.getOrDefault(s.charAt(h),0)+1);
            int k = h-l+1;
            if(k== map.size()){
                res = Math.max(res, k);
            }
            // System.out.println("before :"+map);
            while(k>map.size()){
                // System.out.println(map);
                map.put(s.charAt(l), map.get(s.charAt(l))-1);
                if(map.get(s.charAt(l))==0){
                    map.remove(s.charAt(l));
                }
                l++;
                k = h-l+1;
            }
            // System.out.println("after: "+map);
        }
        return res==Integer.MIN_VALUE?0:res;
    }
}