class CustomStack {

    Stack<Integer> stack;
    int limit = 0;

    public CustomStack(int maxSize) {
        stack = new Stack<>();
        limit = maxSize;
    }
    
    public void push(int x) {
        if(stack.size() == limit)  return;

        stack.push(x);
    }
    
    public int pop() {

        if(stack.isEmpty())  return -1;
        int element = stack.peek();
        stack.pop();
        return element;
    }
    
    public void increment(int k, int val) {
        Stack<Integer> temp = new Stack<>();
        while(!stack.isEmpty()){
            temp.push(stack.peek());
            stack.pop();
        }

        // while(!temp.isEmpty()){
        //     while(k-- > 0){
        //         int n = temp.peek() + val;
        //         stack.push(n);
        //         temp.pop();
        //     }
        // }

        if(temp.size() <= k){
            while(!temp.isEmpty()){
                int n = temp.peek() + val;
                stack.push(n);
                temp.pop();
            }
            return;
        }

        while(k-- > 0){
            int n = temp.peek() + val;
            stack.push(n);
            temp.pop();
        }

        while(!temp.isEmpty()){
            stack.push(temp.peek());
            temp.pop();
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