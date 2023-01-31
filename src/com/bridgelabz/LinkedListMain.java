package com.bridgelabz;

public class LinkedListMain {

    public static void main(String[] args) {
        //Creating Object of LinkedList class.
        System.out.println("Searched Element :- ");
        LinkedList<Integer> linkedListSix = new LinkedList<>();
        linkedListSix.push(70);
        linkedListSix.push(30);
        linkedListSix.push(56);
        boolean isInserted = linkedListSix.insertAfter(40, 30);
        linkedListSix.display();
        if (isInserted)
            System.out.println("Element inserted successfully");
        else
            System.out.println("Element not inserted");
    }
}
