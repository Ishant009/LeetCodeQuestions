class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str = strs[0];
        // String maxStr = strs[0];
        // String res="";
        for(int i=0;i<str.length();i++){
            
            for(int j=1;j<strs.length;j++){
                if(str.length()==0|| i>=strs[j].length()|| strs[j].charAt(i)!=str.charAt(i)){
                    return str.substring(0, i);
                }
            }
        }
        return str;
    }
}