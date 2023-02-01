package com.bridgelabz;

public class LinkedListMain {

    public static void main(String[] args) {
        //Creating Object of LinkedList class.
        LinkedList linkedList4 = new LinkedList();
        linkedList4.push(70);
        linkedList4.push(40);
        linkedList4.push(30);
        linkedList4.push(56);
        linkedList4.display();
        System.out.println(linkedList4.delete(40)+" is deleted");
        linkedList4.display();
        linkedList4.size();
    }
}
