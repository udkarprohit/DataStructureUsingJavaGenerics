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

    public boolean insertAfter(L insertElement, L searchData) {
        Node<L> searchedData = searchNode(searchData);
        if (searchedData != null) {
            Node<L> newNode = new Node(insertElement);
            Node<L> temp = searchedData.next;
            searchedData.next = newNode;
            newNode.next = temp;
            return true;
        }
        return false;
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
