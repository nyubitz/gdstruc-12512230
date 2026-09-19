package com.gdstruc.module2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Player> playerList = new ArrayList<>();

        playerList.add(new Player(1, "Watney", 100));
        playerList.add(new Player(2, "Grace", 97));
        playerList.add(new Player(3, "Linus", 54));

        playerList.add(2, new Player(78, "Danny", 102));

        playerList.remove(2);

        //System.out.println(playerList.contains(new Player(2, "Grace", 97)));

        System.out.println(playerList.indexOf(new Player(2, "Grace", 97)));

        for (Player p : playerList)
        {
            System.out.println(p);
        }


    }
}
