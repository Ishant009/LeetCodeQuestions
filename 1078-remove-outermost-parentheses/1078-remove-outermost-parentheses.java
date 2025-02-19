class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(stack.isEmpty()){
                stack.push(c);
                continue;
            }
            if(c=='('){
                stack.push(c);
            }else {
                stack.pop();
                if(stack.isEmpty()){
                    continue;
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }
}