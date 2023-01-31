package com.bridgelabz;

public class LinkedListMain {

    public static void main(String[] args) {
        //Creating Object of LinkedList class.
        System.out.println("Deletion From Start:- ");
        LinkedList<Integer> linkedListFour = new LinkedList<>();
        linkedListFour.push(70);
        linkedListFour.push(30);
        linkedListFour.push(56);
        linkedListFour.deleteFromStart();

        linkedListFour.display();

    }
}
