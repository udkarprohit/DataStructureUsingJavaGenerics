package com.bridgelabz;

public class LinkedListMain {

    public static void main(String[] args) {
        //Creating Object of LinkedList class.
        System.out.println("Inserting :- ");
        //Calling non-static method using object
        LinkedList<Integer> linkedListThree = new LinkedList<>();
        linkedListThree.push(70);
        linkedListThree.push(56);
        linkedListThree.insert(56, 30);

        linkedListThree.display();

    }
}
