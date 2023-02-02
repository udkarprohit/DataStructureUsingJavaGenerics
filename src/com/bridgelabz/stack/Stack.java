package com.bridgelabz.stack;

import com.bridgelabz.Node;

public class Stack<S> {

    public Node<S> top;

    public void push(S data) {
        Node<S> newNode = new Node<>(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public boolean pop(){
        while (top.next != null){
            top = top.next;
        }
        if (top.next == null){
            top = null;
            return true;
        }
        return false;
    }

    public void display() {
        Node<S> temp = top;
        while (temp != null) {
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
        System.out.println();
    }
}
