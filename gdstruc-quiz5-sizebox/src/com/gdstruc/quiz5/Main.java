package com.gdstruc.quiz5;

public class Main {

    public static void main(String[] args){

        Player mark = new Player ("W4TN3Y", "Mark", 100);
        Player leon = new Player("Leon_K", "LEON", 231);
        Player haseul = new Player("WhiteBird", "haseul", 180);
        Player bryan = new Player("BryBry", "Bryan", 23);
        Player hyper = new Player("HyperStar", "HyperStar", 72);
        Player sophie = new Player("s0ph1", "sophieee", 82);
        Player ego = new Player("3G00", "3G0", 102);



        BoxSet playerList = new BoxSet();

        playerList.put(mark);
        playerList.put(leon);
        playerList.put(haseul);
        playerList.put(bryan);
        playerList.put(hyper);
        playerList.put(sophie);
        playerList.put(ego);

        playerList.printAll();

        playerList.search("Leon_K");

        playerList.search("TESTNAME");

        playerList.remove("W4TN3Y");
        playerList.printAll();
    }
}