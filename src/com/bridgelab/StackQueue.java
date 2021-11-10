package com.bridgelab;

public class StackQueue {
    //Represent the Stack pointer top
    public static Node top = null;
    public Node front = null;
    public Node rear = null;

    public static void push(int data) {
        Node node = new Node(data);
        if (node == null) {
            System.out.println("Stack is Empty");
            node.next = null;
        } else {
            node.next = top;
        }
        top = node;
        System.out.println("Pushed " + data);
    }

    //Method to display the stack Peek value
    public void peek() {
        if (top == null)
            System.out.println("Stack is underflow");
        else
            System.out.println("Stack Peek value is : " + top.data);
    }

    //Method to display the stack Pop value
    public void pop() {
        if (top == null)
            System.out.println("Stack is underflow");
        else {
            System.out.println("Stack Pooped value is : " + top.data);
            top = top.next;
        }
    }

    public void display() {
        if (top == null)
            System.out.println("Stack is Under flow");
        Node temp = new Node(top.data);
        temp = top;
        System.out.println("Stack Contains data in LIFO Order : ");
        while (temp != null) {
            System.out.println(+temp.data);
            temp = temp.next;
        }
    }

    public void enque(int data) {
        Node node = new Node(data);
        if (front == null) {
            System.out.println("Queue is Empty");
            front=node;
        } else {
            rear.next = node;
        }
        rear = node;
        System.out.println("Data enque" + data);
    }

    public void queDisplay() {
        if (front == null)
            System.out.println("Queue is empty");
        Node temp = new Node(front.data);
        temp = front;
        System.out.println("Queue Contains data in FIFO Order : ");
        while (temp != null) {
            System.out.println(+temp.data);
            temp = temp.next;
        }
    }
}


