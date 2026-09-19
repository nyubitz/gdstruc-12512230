package com.gdstruc.module2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Player heejin = new Player(1, "Heejin", 27);
        Player hyunjin = new Player(2, "Hyunjin", 84);
        Player haseul = new Player(3, "Haseul", 121);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(heejin);
        playerLinkedList.addToFront(hyunjin);
        playerLinkedList.addToFront(haseul);

        playerLinkedList.printList();
    }

}

