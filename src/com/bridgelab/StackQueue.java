package com.bridgelab;

public class StackQueue {
    //Represent the Stack pointer top
    public static Node top = null;

    public static void push(int data) {
        Node node = new Node(data);
        if (node == null) {
            System.out.println("Stack is Under flow");
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
}


