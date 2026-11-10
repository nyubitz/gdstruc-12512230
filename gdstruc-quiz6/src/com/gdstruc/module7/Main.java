package com.gdstruc.module7;

public class Main {

    public static void main(String[] args) {

        Tree tree = new Tree();

        tree.insert(25);
        tree.insert(17);
        tree.insert(29);
        tree.insert(53);
        tree.insert(-9);
        tree.insert(-16);
        tree.insert(2);
        tree.insert(-32);

        //tree.traverseInOrder();
        tree.traverseInOrderDescending();
        System.out.println(tree.getMax());
        System.out.println(tree.getMin());

    }
}
