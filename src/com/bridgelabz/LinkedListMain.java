package com.bridgelabz;

public class LinkedListMain {

    public static void main(String[] args) {
        //Creating Object of LinkedList class.
        System.out.println("Searched Element :- ");
        LinkedList<Integer> linkedListSix = new LinkedList<>();
        linkedListSix.push(70);
        linkedListSix.push(30);
        linkedListSix.push(56);
        linkedListSix.display();
        boolean result = linkedListSix.searchNode(30);
        if (result) {
            System.out.println("Node with value 30 found in the LinkedList.");
        } else {
            System.out.println("Node with value 30 not found in the LinkedList.");
        }
    }
}
