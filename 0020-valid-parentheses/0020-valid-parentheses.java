class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char x= s.charAt(i);
            if(x=='(' || x=='[' || x=='{'){
                stack.push(x);
            }else{
                if(stack.isEmpty()) return false;
                System.out.println(x+" "+ stack.peek());
                if(methodCall(x, stack.peek())){
                    stack.pop();
                }else return false;
            }
        }
        System.out.println(stack.isEmpty());
        return stack.isEmpty();
    }
    public boolean methodCall(char x, char y){
        return ( y=='{' && x=='}' ||  y=='(' && x==')' ||  y=='[' && x==']');
    }
}