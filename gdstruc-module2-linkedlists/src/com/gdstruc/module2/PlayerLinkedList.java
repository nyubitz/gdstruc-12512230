package com.gdstruc.module2;

public class PlayerLinkedList {
    private PlayerNode head;
    private int size;

    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(getHead());
        playerNode.getNextPlayer().setPreviousPlayer(playerNode);
        setHead(playerNode);
        addToSize();
    }

    public void printList() {
        PlayerNode current = getHead();
        System.out.println("LINKED LIST SIZE: " + getSize());

        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current.getPlayer());
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
    }

    public void removeHead(){
        PlayerNode toRemove = getHead();
        PlayerNode newHead = toRemove.getNextPlayer();
        setHead(newHead);
        newHead.setPreviousPlayer(null);
        removeSize();
    }

    public int indexOf(Player player){
        int indexCount = -1;

        if (!contains(player)) {
            System.out.println("Player not in LinkedList");
            return null;
        }

        PlayerNode current = getHead();
        while(true){
            indexCount +;

             if (current.getPlayer() == player){
                 break;
             }

            current = current.getNext();
        }

        return indexCount;
    }

    public boolean contains(Player player){
        boolean contains = false;

        PlayerNode current = getHead();
        while (current != null){
            if (current.getPlayer() == player) {
                contains = true;
                break;
            }
                current = current.getNextPlayer();
        }

        return contains;
    }

    public PlayerNode getHead() {
        return head;
    }

    public void setHead(PlayerNode head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void addToSize() {
        this.size += 1;
    }

    public void removeSize() {
        this.size -= 1;
    }
}
