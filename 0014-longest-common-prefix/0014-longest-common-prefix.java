class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String st = strs[0];
        String maxStr = strs[0];
        for(String str: strs){
            int i=0;
            String cmnStr="";
            while(i<st.length() && i<str.length()){
                if(st.charAt(i)==str.charAt(i)){
                cmnStr+=str.charAt(i);
                }else{
                    break;
                }
                i++;
            }
            st = cmnStr;
            if(cmnStr.length()<maxStr.length()){maxStr=cmnStr;}
            cmnStr="";
        }
        return maxStr;
    }
}