class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String str = strs[0];
        String maxStr = strs[0];
        String res="";
        for(String st: strs){
            int i=0;
            
            while(i<str.length()){
                if(i==st.length() || st.charAt(i)!=str.charAt(i)){
                break;
                }
                res+=str.charAt(i);
                i++;
            }
            str=res;
            res="";
        }
        return str;
    }
}