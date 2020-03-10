package queue;

public class MyQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public MyQueue(int totalSize) {
        queue=new int[totalSize];
        front=0;
        rear=0;
        size=0;
    }
    public boolean isEmpty(){
        boolean response=false;
        if(rear==front){
            response=true;
        }
        return response;
    }


    public boolean enqueue(int element){
        boolean response=false;
        if (rear != queue.length){
            queue[rear]=element;
            rear++;
            response=true;
            size++;
        }
        return response;
    }

    public int deueue(){
        int response=0;
        if(isEmpty()){
            System.out.print("can't dequeue, queue is empty");
        }
        else{
            response=queue[front];
            front++;
            size--;
        }
        return response;
    }

    public int peek(){
        int response=0;
        if(isEmpty()){
            System.out.print("can't peek,queue is empty");
        }
        else{
            response=queue[front];
        }
        return response;
    }
    public int getSize(){
        return size;
    }
}