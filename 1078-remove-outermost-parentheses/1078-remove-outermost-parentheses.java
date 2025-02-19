class Solution {
    public String removeOuterParentheses(String s) {
        int flag = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(!(flag==0 && c=='(') && !(flag==1 && c==')')){
                sb.append(c);
            }
            if(c=='(') flag++;
            else flag--;
        }
        return sb.toString();
    }
}