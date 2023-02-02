package com.bridgelabz;

import com.bridgelabz.stack.Stack;

public class LinkedListMain {

    public static void main(String[] args) {
        //Creating Object of Stack class.
        Stack<Integer> stack = new Stack<>();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.display();
        if (stack.pop()){
            System.out.println("Stack is => " + stack.top);
        } else {
            System.out.println("Stack is not empty =>" + stack.top.data);
        }
        stack.display();
    }
}
