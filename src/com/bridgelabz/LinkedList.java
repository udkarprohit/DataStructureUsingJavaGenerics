package com.bridgelabz;

public class LinkedList<L> {

    Node<L> head;
    Node<L> tail;

    //adding data to linked-list
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
    //Displaying the linked-list
    public void display() {
        Node<L> temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
        System.out.println();
    }
    //Appending:- Adding elements from last node
    public void append(L data) {
        Node<L> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node<L> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
}