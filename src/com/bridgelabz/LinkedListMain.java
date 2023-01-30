package com.bridgelabz;

public class LinkedListMain {

    public static void main(String[] args) {
        //Creating Object of LinkedList class.
        LinkedList<Integer> linkedListOne = new LinkedList<>();
        //Calling non-static method using object
        linkedListOne.push(70);
        linkedListOne.push(30);
        linkedListOne.push(56);

        linkedListOne.display();

        System.out.println("Appending : ");
        LinkedList<Integer> linkedListTwo = new LinkedList<>();
        linkedListTwo.append(56);
        linkedListTwo.append(30);
        linkedListTwo.append(70);
        linkedListOne.display();
    }
}
