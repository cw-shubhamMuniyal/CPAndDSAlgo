package DS.Stack;

/**
 * Created by User on 27-08-2020.
 */
import java.util.*;

class QueueUsingStack {

    /** Initialize your data structure here. */
    Stack<Integer> st1, st2;
    int front;
    public QueueUsingStack() {
        st1=new Stack();
        st2=new Stack();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        if(st1.isEmpty()){
            front=x;
        }
        st1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int n=st1.size()-1,val;

        if(st2.isEmpty()){
            for(int i=0;i<n;i++){
                st2.push(st1.pop());
            }
            val= st1.pop();
        }
        else{
            val=st2.pop();
        }
        return val;
    }

    /** Get the front element. */
    public int peek() {
        if(!st2.isEmpty()){
            return st2.peek();
        }
        return front;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(st1.isEmpty() && st2.isEmpty() ){
            return true;
        }
        return false;
    }

    // public static void main(String[] args){
    //     MyQueue obj = new MyQueue();
    //      obj.push(12);
    //      int param_2 = obj.pop();
    //      int param_3 = obj.peek();
    //      boolean param_4 = obj.empty();
    // }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
