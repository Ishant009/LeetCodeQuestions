class Solution {
    public int longestPalindrome(String s) {

        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for(int i=0;i<chars.length;i++){
            map.put(chars[i], map.getOrDefault(chars[i], 0)+1);
        }
        boolean odd = false;
        int count = 0;
        // System.out.println(map);
        for(var entry: map.entrySet()){
            // System.out.println(entry.getKey()+"    "+entry.getValue());
            if(!odd && entry.getValue()%2!=0){
                count+= entry.getValue();
                odd=true;
            }else if(entry.getValue()%2!=0){
                count+= entry.getValue()-1;
            }else{
                count+= entry.getValue();
            }
        }
        
        return count;
    }
}