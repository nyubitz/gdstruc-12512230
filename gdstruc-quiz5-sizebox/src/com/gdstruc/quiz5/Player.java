package com.gdstruc.quiz5;

import java.util.Objects;

public class Player {
    private String userName;
    private String displayName;
    private int level;

    public Player(String userName, String name, int level) {
        this.userName = userName;
        this.displayName = name;
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getdisplayName() {
        return displayName;
    }

    public void setdisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getuserName() {
        return userName;
    }

    public void setuserName(String userName) {
        this.userName = userName;
    }

    public void printValue(){
        System.out.println ("Player{" +
                "userName=" + userName +
                ", display name='" + displayName +
                ",  level=" + level +
                "}" );
    }

    @Override
    public String toString() {
        return "Player{" +
                "userName=" + userName +
                ", display name='" + displayName + '\'' +
                ",  level=" + level +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return userName == player.userName && level == player.level && Objects.equals(displayName, player.displayName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, displayName, level);
    }
}
