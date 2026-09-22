package com.gdstruc.module3;

public class Main {

    public static void main(String[] args){

        ArrayStack stack = new ArrayStack(5);

        stack.push(new Player(1, "aceu", 100));
        stack.push(new Player(2, "Sinatraa", 100));
        stack.push(new Player(3, "Subroza", 95));
        stack.push(new Player(4, "ploo", 198));

        //stack.printStack();

        System.out.println("Popping: " + stack.peek());

        //stack.printStack();

    }
}
