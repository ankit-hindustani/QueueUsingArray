package main;
import queue.*;


public class MyMain {
    public static void main(String[] args) {
        MyQueue obj=new MyQueue(5);
        System.out.println(obj.isEmpty());
        System.out.println(obj.peek());
        System.out.println("size= "+obj.getSize());
        System.out.println(obj.enqueue(1));
        System.out.println(obj.enqueue(2));
        System.out.println(obj.enqueue(3));
        System.out.println(obj.enqueue(4));
        System.out.println(obj.enqueue(5));
        System.out.println(obj.enqueue(6));
        System.out.println("size= "+obj.getSize());

        System.out.println(obj.isEmpty());
        System.out.println(obj.peek());
        
        System.out.println(obj.deueue());
        System.out.println(obj.deueue());
        System.out.println(obj.deueue());
        System.out.println(obj.deueue());
        System.out.println(obj.deueue());
        System.out.println(obj.deueue());

        System.out.println(obj.enqueue(11));
        System.out.println(obj.enqueue(22));
        System.out.println(obj.enqueue(33));
        System.out.println(obj.enqueue(44));
        System.out.println(obj.enqueue(55));
        System.out.println(obj.enqueue(66));
        System.out.println(obj.getSize());
    }

}
