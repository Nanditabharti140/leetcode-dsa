class MyQueue {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> helper = new Stack<>();

    public MyQueue() {
    }

    public void push(int x) {  
        //push at bottom of stack
        while(st.size() > 0) helper.push(st.pop());
        st.push(x);
        while(helper.size() > 0) st.push(helper.pop());
    }
    
    public int pop() {
       return st.pop();
    }
    
    public int peek() {
     return st.peek();
    }
    
    // public void push(int x) {    0(1) this is push efficient approach
    //     st.push(x);
    // }
    
    // public int pop() {  o(n)
    //     //st ka bottom remove kro
    //     while(st.size() > 1) helper.push(st.pop());
    //     int front = st.pop();
    //     while(helper.size() > 0) st.push(helper.pop());
    //     return front;
    // }
    
    // public int peek() {
    //      //st ka bottom print kro
    //     while(st.size() > 1) helper.push(st.pop());
    //     int front = st.peek();
    //     while(helper.size() > 0) st.push(helper.pop());
    //     return front;
    // }
    
    public boolean empty() {
        return (st.size() == 0);
    }
}


