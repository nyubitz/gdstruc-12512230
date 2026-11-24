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

        count += 1;
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
            int number = i + 1;
            if (players[i] != null) {
                System.out.print("  " + number + ". ");
                players[i].printValue();
            }
        }
    }

    public void remove(String username){
        for (int i = 0; i < count; i++){
            if (players[i] != null && Objects.equals(players[i].getuserName(), username)) {
                System.out.println("PLAYER FOUND!... THEY WILL BE REMOVED...");

                players[i] = null;

                for (int o = i; i < count; o++){
                    if (players[o+1] != null){
                        players[o] = players[o+1];
                    } else {
                        players[o] = null;
                    }

                    if (players[o] == null){
                        return;
                    }
                }

                return;
            }
        }

        System.out.println("PLAYER NOT FOUND... WOMP WOMP... ");
        System.out.println("Use put() to add \n");
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
