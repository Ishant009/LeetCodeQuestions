class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack();
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(c);
                continue;
            }
            if(c=='('){
                stack.push(c);
                sb.append(c);
            }else {
                stack.pop();
                if(!stack.isEmpty()){
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}