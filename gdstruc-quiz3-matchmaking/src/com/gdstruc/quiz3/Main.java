package com.gdstruc.quiz3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int fullGames = 0;
        ArrayQueue queue = new ArrayQueue(7);
        List<Player> playerList = new ArrayList<>();

        addPlayers(playerList);

        while(fullGames < 10){
            if (queue.size() >= 5){
                fullGames++;
                System.out.println("MATCH CREATED! " + fullGames + " matches ongoing... \n");
                createMatch(queue);
                System.out.println(queue.size() + " PLAYERS IN QUEUE...");
                queue.printQueue();
            } else
            {
                randQueue(queue, playerList);
            }

            pressEnterToContinue();
        }
    };

    public static void randQueue(ArrayQueue queue, List<Player> playerList) {
        int randCount = (int) (Math.random() * 7) + 1; // rand from 1 to 7
        int randPlayer;

        for (int i = 0; i < randCount; i++) {
            randPlayer = (int) (Math.random() * playerList.size());
            queue.add(playerList.get(randPlayer));
        }

        System.out.println(queue.size() + " PLAYERS IN QUEUE...");
        queue.printQueue();
    }

    public static void addPlayers(List<Player> playerList)
    {
        playerList.add(new Player(1, "W4TN3Y", 100));
        playerList.add(new Player(2, "Ry_Grace", 97));
        playerList.add(new Player(3, "Linus42", 54));
        playerList.add(new Player(4, "HalJ0RDAN", 124));
        playerList.add(new Player(5, "JoshCullenReal", 67));
        playerList.add(new Player(6, "Carol091", 73));
        playerList.add(new Player(7, "SM1ISKIZ", 141));
        playerList.add(new Player(8, "WaffleSuns", 21));
        playerList.add(new Player(9, "DrHouseMD", 321));
        playerList.add(new Player(10, "LethamB14", 32));

    }

    public static void createMatch(ArrayQueue queue)
    {
        for (int i = 0; i < 5; i++){
            queue.remove();
        }
    }

    private static void pressEnterToContinue() {
        System.out.print("Press ENTER to continue...\n");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); // Blocks execution until ENTER is pressed
    }
}