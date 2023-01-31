package com.bridgelabz;

public class LinkedList<L> {

    Node<L> head;
    Node<L> tail;

    //Adding data to linked-list
    public void push(L data) {
        Node<L> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    //Deleting elements from start
    public void deleteFromStart() {
        head = head.next;
    }

    //Displaying the linked-list
    public void display() {
        Node<L> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
        System.out.println();
    }
}
