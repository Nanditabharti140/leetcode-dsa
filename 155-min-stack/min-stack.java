class MinStack {
    Stack<Integer> minStack;
    Stack<Integer> st;

    public MinStack() {
        st =  new Stack<>();
        minStack =  new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(minStack.size() == 0 || val < minStack.peek()) minStack.push(val);
        else minStack.push(minStack.peek());
    }
    
    public void pop() {
        st.pop();
        minStack.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minStack.peek();
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