class Solution {
    public String removeOuterParentheses(String s) {
        int flag = 0;
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            // char c = s.charAt(i);
            if(!(flag==0 && c=='(') && !(flag==1 && c==')')){
                sb.append(c);
            }
            if(c=='(') flag++;
            else flag--;
        }
        return sb.toString();
    }
}