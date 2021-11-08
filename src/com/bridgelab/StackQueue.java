package com.bridgelab;

public class StackQueue {
    //Represent the Stack pointer top
    public static Node top = null;
    public static void push(int data){
        Node node = new Node(data);
        if (node == null){
            System.out.println("Stack is Under flow");
            node.next = null;
        }else {
            node.next = top;
        }
        top = node;
        System.out.println("Pushed " + data);
    }

    public void display() {
        if (top == null)
            System.out.println("Stack is Under flow");
        Node temp = new Node(top.data);
        temp = top;
        System.out.println("Stack Contains data in LIFO Order : ");
        while (temp != null){
            System.out.println(+temp.data);
            temp = temp.next;
        }
    }
}
