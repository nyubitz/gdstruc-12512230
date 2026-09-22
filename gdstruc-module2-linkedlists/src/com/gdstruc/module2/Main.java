package com.gdstruc.module2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Player asuna = new Player(1, "Asuna", 27);
        Player lethalBacon = new Player(2, "LethalBacon", 84);
        Player hpDeskjet = new Player(3, "HPDeskjet", 121);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(asuna);
        playerLinkedList.addToFront(lethalBacon);
        playerLinkedList.addToFront(hpDeskjet);

        playerLinkedList.printList();

        Player heathcliff = new Player(21, "Heathcliff", 92);

        playerLinkedList.addToFront(heathcliff);
        playerLinkedList.printList();

        playerLinkedList.removeHead();
        playerLinkedList.printList();

        System.out.print("Contains lethalbacon: ");
        System.out.println (playerLinkedList.contains(lethalBacon));


        System.out.print("Index Of Asuna: ");
        System.out.println (playerLinkedList.indexOf(asuna));

    }
}

