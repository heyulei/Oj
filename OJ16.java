import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        if(!stack1.empty()){
            stack1.push(node);
        }else{
            stack2.push(node);
        }
    }
    
    public int pop() {
        int ret = -99999;
        if (!stack1.empty()){
            turnStack(stack1,stack2);
        }else{
           turnStack(stack2,stack1);
        }
        if (!stack1.empty()){
            ret = stack1.peek();
            stack1.pop();
        }else{
            ret = stack2.peek();
            stack2.pop();
        }
        
        if(!stack1.empty()){
           /* while(!stack1.empty()){
                stack2.push(stack1.peek());
                stack1.pop();
            }*/
            turnStack(stack1,stack2);
        }else{
               turnStack(stack2,stack1);
            }
        return ret;
        }
    private void turnStack(Stack<Integer> stack1,Stack<Integer> stack2 ){
        while(!stack1.empty()){
                stack2.push(stack1.peek());
                stack1.pop();
            }
    }
}
