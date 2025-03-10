import java.util.Stack;

public class MinStack {	
	/**Using Stacks: Time O(1) | Space O(n) **/
	Stack<Integer> stk;
    Stack<Integer> minStk;
    
    public MinStack() {
    	stk = new Stack<>();
    	minStk = new Stack<>();
    }
    
    public void push(int val) {
        stk.push(val);
        if(minStk.isEmpty() || val <= minStk.peek()){
            minStk.push(val);
        }
    }
    
    public void pop() {
        if(stk.peek().equals(minStk.peek())){
            minStk.pop();
        }
        stk.pop();
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return minStk.peek();
        
    }	
}
