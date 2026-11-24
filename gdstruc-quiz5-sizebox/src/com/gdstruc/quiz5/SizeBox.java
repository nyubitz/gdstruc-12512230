package com.gdstruc.quiz5;

import java.util.Objects;

public class SizeBox {
    private Player[] players;
    private int count;

    public SizeBox() {
        players = new Player[10];
        count = 0;
    }

    public SizeBox(int count) {
        players = new Player[count];
    }

    public void put(Player player) {

        if (count == players.length) {
            Player[] newBox = new Player[players.length * 2];
            System.arraycopy(players, 0, newBox, 0, players.length);
            players = newBox;
        }

        players[count] = player;

        count++;
    }

    public void search(String username){

        for (int i = 0; i < count; i++){
            if (players[i] != null && Objects.equals(players[i].getuserName(), username)) {
                System.out.println("PLAYER FOUND!");
                players[i].printValue();
                System.out.println("\n");
                return;
            }
        }

        System.out.println("PLAYER NOT FOUND... WOMP WOMP... ");
        System.out.println("Use put() to add \n");
    }

    public void print(){
        for (int i = 0; i < count; i++){
            if (players[i] != null) {
                System.out.print("  " + i + ". ");
                players[i].printValue();
            }
        }
    }

    public boolean isEmpty(){
        boolean isEmpty = true;

        for (int i = 0; i < count; i++){
            if (players[i] != null){
                isEmpty = false;
            }
        }

        return isEmpty;
    }


    public int length(){
        return players.length;
    }
}
