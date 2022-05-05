class MyStack {

    Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack() {
        q1=new LinkedList<Integer>();
        q2=new LinkedList<Integer>(); 
    }
    
    public void push(int x) {
        while (!q1.isEmpty())
            q2.offer(q1.remove());

        q1.offer(x);
        
        while (!q2.isEmpty())
            q1.offer(q2.remove());
    }
    
    public int pop() {
       return q1.remove();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}
