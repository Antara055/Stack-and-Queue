package com.bridgelab;

public class StackQueueMain {
    public static void main(String[] args){
        System.out.println("Welcome to Stack and Queue problem");
        StackQueue stack = new StackQueue();
        StackQueue queue=new StackQueue();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        ///calling method display to Displaying Stack
        stack.display();
        while (stack.top != null){
            stack.peek();
            stack.pop();
        }
        if (stack.top == null) {
            System.out.println("Stack is empty");
        }
        queue.enque(56);
        queue.enque(30);
        queue.enque(70);
        //calling method QueDisplay to Displaying Queue
        queue.queDisplay();

    }
}
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
