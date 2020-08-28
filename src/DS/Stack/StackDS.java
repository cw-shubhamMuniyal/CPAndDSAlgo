package DS.Stack;

import java.util.EmptyStackException;
/**
 * Created by User on 11-08-2020.
 */

public class StackDS {
    int top;
    int size;
    Object arr[];
    public StackDS(int size){
        top=-1;
        this.size=size;
        arr=new Object[size];
    }

    public boolean push(Object item){
        if(!isFull()){
            arr[++top]=item;
            return true;
        }
        return false;
    }

    public Object pop() {
        if(!isEmpty()){
            Object item=arr[top];
            top--;
            return item;
        }
        return new EmptyStackException();
    }

    public Object peek(){
        if(!isEmpty()){
            return arr[top];
        }
        return new EmptyStackException();
    }

    public boolean isFull(){
        if(top==size){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }
}
