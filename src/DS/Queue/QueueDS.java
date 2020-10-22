package DS.Queue;

/**
 * Created by User on 22-10-2020.
 */
public class QueueDS {
    private int rear, front;
    private int size, capacity;
    private Object arr[];
    public QueueDS(int capacity){
        this.rear=-1;
        this.front=0;
        this.size=0;
        this.capacity=capacity;
        this.arr=new Object[this.capacity];
    }

    public boolean enque(Object item){
        if(!isFull()){
            this.rear=(this.rear+1)%this.capacity;
            this.arr[rear]=item;
            this.size++;
            return true;
        }
        return false;
    }

    public Object deque() {
        if(!isEmpty()){
            Object item=this.arr[this.front];
            this.front=(this.front+1)%this.capacity;
            this.size--;
            return item;
        }
        return new EmptyQueueException("Queue is empty");
    }

    public Object front(){
        if(!isEmpty()){
            return this.arr[this.front];
        }
        return new EmptyQueueException("Queue is empty");
    }

    public Object rear(){
        if(!isEmpty()){
            return this.arr[this.rear];
        }
        return new EmptyQueueException("Queue is empty");
    }

    public boolean isFull(){
        return (this.size == this.capacity);
    }

    public boolean isEmpty(){
        return (this.size==0);
    }
}

class EmptyQueueException extends Exception
{
    public EmptyQueueException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}
