package com.bridgelabz;

public class LinkedListMain {

    public static void main(String[] args) {
        //Creating Object of LinkedList class.
        SortedLinkedList sortedLinkedList = new SortedLinkedList();
        sortedLinkedList.sortLinkedlist(56);
        sortedLinkedList.sortLinkedlist(30);
        sortedLinkedList.sortLinkedlist(40);
        sortedLinkedList.sortLinkedlist(70);
        System.out.print("Sorted list :- ");
        sortedLinkedList.display();
    }
}
