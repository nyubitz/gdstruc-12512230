package com.gdstruc.midterm;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        CardStack cardPile = new CardStack("cardPile");

        cardPile.addCard(new Card(1, "The Black Rabbit"));
        cardPile.addCard(new Card(2, "The Black Cat"));
        cardPile.addCard(new Card(3, "The Black Bird"));
        cardPile.addCard(new Card(4, "The Black Frog"));
        cardPile.addCard(new Card(5, "The Black Deer"));
        cardPile.addCard(new Card(6, "The Black Owl"));
        cardPile.addCard(new Card(7, "The Black Fish"));
        cardPile.addCard(new Card(8, "The Black Bat"));
        cardPile.addCard(new Card(9, "The Black Swan"));
        cardPile.addCard(new Card(10, "The Black Penguin"));
        cardPile.addCard(new Card(11, "The Black Butterfly"));
        cardPile.addCard(new Card(12, "The Black Wolf"));
        cardPile.addCard(new Card(13, "The Rainbow Rabbit"));
        cardPile.addCard(new Card(14, "The Rainbow Cat"));
        cardPile.addCard(new Card(15, "The Rainbow Bird"));
        cardPile.addCard(new Card(16, "The Rainbow Frog"));
        cardPile.addCard(new Card(17, "The Rainbow Deer"));
        cardPile.addCard(new Card(18, "The Rainbow Owl"));
        cardPile.addCard(new Card(19, "The Rainbow Fish"));
        cardPile.addCard(new Card(20, "The Rainbow Bat"));
        cardPile.addCard(new Card(21, "The Rainbow Swan"));
        cardPile.addCard(new Card(22, "The Rainbow Penguin"));
        cardPile.addCard(new Card(23, "The Rainbow Butterfly"));
        cardPile.addCard(new Card(24, "The Rainbow Wolf"));
        cardPile.addCard(new Card(2, "The Black Cat"));
        cardPile.addCard(new Card(9, "The Black Swan"));
        cardPile.addCard(new Card(15, "The Rainbow Bird"));
        cardPile.addCard(new Card(23, "The Rainbow Butterfly"));
        cardPile.addCard(new Card(12, "The Black Wolf"));
        cardPile.addCard(new Card(16, "The Rainbow Frog"));

        System.out.println("This is the total Card Pile");
        cardPile.printStack();
        System.out.println();

        CardStack playerCards = new CardStack("playerCards");
        CardStack discardPile = new CardStack("discardPile");

        System.out.println("You start with 5 cards from the pile");
        cardPile.drawCard(5, playerCards);
        playerCards.printStack();

        while(playerCards.getSize() > 0) {
            int turnCount = 1;
            System.out.println("TURN " + turnCount);

            int turnChoice = (int)(Math.random() * 4);
            int cardCount = (int)(Math.random() * 6);

            switch (turnChoice){
                case 1:
                    System.out.println("The bot has chosen to DRAW CARD");
                    cardPile.drawCard(cardCount, playerCards);
                    System.out.println("You now have " + cardCount + " more cards!");
                    break;
                case 2:
                    System.out.println("The bot has chosen to DISCARD CARDS");
                    playerCards.discardCard(cardCount, discardPile);
                    System.out.println("You have discarded " + cardCount + " cards!");
                    break;
                case 3:
                    System.out.println("The bot has chosen to DRAW from the DISCARD PILE!");
                    discardPile.drawCard(cardCount, playerCards);
                    System.out.println("You now have " + cardCount + " more cards!");
                    break;
            }

            turnCount++;
            playerCards.printStack();
            pressEnterToContinue();
        }

    }

    private static void pressEnterToContinue() {
        System.out.print("Press ENTER to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); // Blocks execution until ENTER is pressed
    }
}

