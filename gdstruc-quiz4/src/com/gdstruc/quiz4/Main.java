package com.gdstruc.quiz4;

public class Main {

    public static void main(String[] args){

        Player mark = new Player(1, "W4TN3Y", 100);
        Player grace = new Player(2, "Ry_Grace", 97);
        Player linus = new Player(3, "Linus4", 54);
        Player hal = new Player(4, "HalJ0RDAN", 124);
        Player josh = new Player(5, "JoshCullenReal", 67);

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put(mark.getUserName(), mark);
        hashtable.put(grace.getUserName(), grace);
        hashtable.put(linus.getUserName(), linus);
        hashtable.put(hal.getUserName(), hal);
        hashtable.put(josh.getUserName(), josh);

        hashtable.printHashtable();

        hashtable.remove("Linus4");

        hashtable.printHashtable();
    }
}