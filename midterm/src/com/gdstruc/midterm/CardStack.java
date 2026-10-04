package com.gdstruc.midterm;

import java.util.LinkedList;
import java.util.ListIterator;

public class CardStack {
    private String name;
    private final LinkedList<Card> cardStack;;

    public CardStack(String name) {
        this.name = name;
        cardStack = new LinkedList<>();
    }

    public void addCard(Card card) {
        cardStack.push(card);
    };

    public void drawCard(int count, CardStack playerStack){
        for (int i = 0; i < count; i++){
            takeCard(playerStack);
        }
    }

    public void discardCard(int count, CardStack discardPile){
        for (int i = 0; i < count; i++) {
            takeCard(discardPile);
        }
    }

    public void takeCard(CardStack recipient)
    {
        Card temp = cardStack.pop();
        recipient.addCard(temp);
    }


    public void printStack()
    {
        int count = 1;
        System.out.println(getName() + " has " + getSize() + " cards.");
        ListIterator<Card> iterator = cardStack.listIterator();
        System.out.println("Printing stack . . .");
        while (iterator.hasNext())
        {
            System.out.print(count + ". ");
            System.out.println(iterator.next());
            count++;
        }
    }

    public int getSize(){
        return cardStack.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
