class MinStack {
    Stack<Integer> stk;
    Stack<Integer> minstk;
    /** initialize your data structure here. */
    public MinStack() {
        stk = new Stack<>();
        minstk = new Stack<>();
    }
    
    public void push(int x) {
        if(minstk.size() == 0)
            minstk.push(x);
        else
            minstk.push(Integer.min(minstk.peek(),x));
        stk.push(x);
        
    }
    
    public void pop() {
        if(stk.size()<=0)
            return;
        stk.pop();
        minstk.pop();
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return minstk.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
