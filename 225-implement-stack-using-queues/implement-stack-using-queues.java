class MyStack {
    Queue<Integer> q = new LinkedList<>();
    public MyStack() {
        
    }
     public void push(int x) {
        q.add(x);
        int n = q.size();
        for(int i = 1; i<=n-1; i++) q.add(q.remove());
    }
    
    public int pop() {
       return q.remove();
    }
    
    public int top() {
      return q.peek();
    }
    
    // public void push(int x) {
    //     q.add(x);   push efficient method
    // }
    
    // public int pop() {
    //     int n = q.size();
    //     for(int i = 1; i<=n-1; i++) q.add(q.remove());
    //     return q.remove();
    // }
    
    // public int top() {
    //     int n = q.size();
    //     for(int i = 1; i<=n-1; i++) q.add(q.remove());
    //     int front = q.peek();
    //     q.add(q.remove());
    //     return front;
    // }
    
    public boolean empty() {
        return (q.size() == 0);
    }
}