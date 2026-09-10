// Last updated: 9/10/2026, 9:54:06 AM
class CustomStack {
    int top=-1;
    int[] stack;
    public CustomStack(int maxSize) {
        stack=new int[maxSize];
    }
    
    public void push(int x) {
        if(top+1==stack.length) return;
        stack[++top]=x;
    }
    
    public int pop() {
        if(top==-1) return top;
        else return stack[top--];
    }
    
    public void increment(int k, int val) {
        int d;
        if(top<k) d=top+1;
        else d=k;
        for(int i=0;i<d;i++){
            stack[i]=stack[i]+val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */