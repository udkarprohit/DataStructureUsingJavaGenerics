package com.bridgelabz;

public class LinkedListMain {

    public static void main(String[] args) {
        //Creating Object of LinkedList class.
        System.out.println("Deletion From End :- ");
        LinkedList<Integer> linkedListFive = new LinkedList<>();
        linkedListFive.push(70);
        linkedListFive.push(30);
        linkedListFive.push(56);
        linkedListFive.deleteFromEnd();

        linkedListFive.display();

    }
}
