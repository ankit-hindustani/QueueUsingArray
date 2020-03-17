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

    //dequeue with O(1), dequeue with O(1) has a problem if one time queue is full then you can't enqueue again.
    public int dequeue(){
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



//remove element with O(n), all bug fixed
     public int dequeueWithOrderN(){
        int response=0;
        if(isEmpty()){
            System.out.print("can't dequeue, queue is empty =");
        }
        else{
            response=queue[0];
            //if only one element in the queue
            if(size>1) {

                for (int i = 1; i < size; i++) {
                    queue[i - 1] = queue[i];
                }
            }
            else{
                queue[0]=0;
            }

            rear--;
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
