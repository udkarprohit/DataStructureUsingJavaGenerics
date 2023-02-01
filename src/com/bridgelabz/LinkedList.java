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

    //Searching element from linked-list
    public Node<L> searchNode(L sData) {
        Node<L> temp = head;
        while (temp != null) {
            if (temp.data.equals(sData))
                return temp;
            temp = temp.next;
        }
        return null;
    }

    public L delete(L popData) {
        Node<L> searchedData = searchNode(popData);
        Node<L> temp = head;
        Node<L> previousNode = null;
        if (searchedData == head) {
            head = temp.next;
        } else {
            while (temp != searchedData) {
                previousNode = temp;
                temp = temp.next;
            }
            previousNode.next = temp.next;
        }
        return popData;
    }
    public void size(){
        Node<L> temp = head;
        int count = 0;
        while ( temp != null){
            temp = temp.next;
            count++;
        }
        System.out.println("Size of linked-list is : "+count);
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
