class MinStack {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    Node top;
    
    public MinStack() {
        
    }
    
    public void push(int val) {
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
    }
    
    public void pop() {
        top = top.next;
    }
    
    public int top() {
        return top.data;
    }
    
    public int getMin() {
        Node temp = top;
        int min = Integer.MAX_VALUE;
        while(temp!=null){
            if(temp.data<min) min = temp.data;
            temp = temp.next;
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */