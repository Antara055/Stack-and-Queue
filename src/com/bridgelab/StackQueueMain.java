package com.bridgelab;

public class StackQueueMain {
    public static void main(String[] args){
        System.out.println("Welcome to Stack and Queue problem");
        StackQueue stack = new StackQueue();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        //Displaying Stack
        stack.display();
        while (stack.top != null){
            stack.peek();
            stack.pop();
        }
        if (stack.top == null)
            System.out.println("Stack is empty");
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
