package com.gdstruc.quiz5;

public class BoxSet {
    private SizeBox[] sizeBoxes;

    public BoxSet() {
        sizeBoxes = new SizeBox[10];

        for (int i = 0; i < 10; i++){
            sizeBoxes[i] = new SizeBox();
        }
    }

    public BoxSet(int count) {
        sizeBoxes = new SizeBox[count];

        for (int i = 0; i < count; i++){
            sizeBoxes[i] = new SizeBox();
        }
    }

    public void put(Player player) {
        int nameSize = player.getuserName().length();

        if (nameSize > sizeBoxes.length) {
            int initialSize = sizeBoxes.length;

            SizeBox[] newBox = new SizeBox[sizeBoxes.length * 2];
            System.arraycopy(sizeBoxes, 0, newBox, 0, sizeBoxes.length);

            sizeBoxes = newBox;

            for (int i = 0; i < sizeBoxes.length; i++) {
                if (sizeBoxes[i] == null){
                    sizeBoxes[i] = new SizeBox();
                }
            }




        }

        sizeBoxes[nameSize - 1].put(player);
    }

    public void search(String username){
        int nameSize = username.length();

        sizeBoxes[nameSize - 1].search(username);

    }

    public void print(int count){
        sizeBoxes[count + 1].print();
    }

    public void printAll(){

        for (int i = 0; i < sizeBoxes.length; i++) {
            int sizeBoxNumber = i + 1;

            if (!sizeBoxes[i].isEmpty()){
                System.out.println(sizeBoxNumber + "-BOX: ");
                sizeBoxes[i].print();
                System.out.print("\n");
            }
        }
    }


//    public void put(String key, Player value) {
//        int hashedKey = hashKey(key);
//
//        if (isOccupied(hashedKey)) {
//            // do linear probing
//            int stoppingIndex = hashedKey;
//
//            if (hashedKey == sizebox.length - 1) {
//                hashedKey = 0;
//            } else {
//                hashedKey++;
//            }
//
//            while (isOccupied(hashedKey) && hashedKey != stoppingIndex) {
//                hashedKey = (hashedKey + 1) % sizebox.length;
//            }
//        }
//
//        if (isOccupied(hashedKey)) {
//            System.out.println("There is already an element at position" + hashedKey);
//        } else {
//            sizebox[hashedKey] = new StoredPlayer(key, value);
//        }


//    public Player get(String key) {
//        int hashedKey = findKey(key);
//
//        if (hashedKey == -1) {
//            return null;
//        }
//
//        return sizebox[hashedKey].value;
//    }
//
//    public void remove(String key) {
//        int hashedKey = findKey(key);
//
//        if (hashedKey == -1) {
//            System.out.println("There was no player found with that key");
//        } else {
//            sizebox[hashedKey] = null;
//            System.out.println("Succesfully removed " + key + " from sizebox at index " + hashedKey);
//        }
//    }
//
//    private int findKey(String key) {
//        int hashedKey = hashKey(key);
//
//        if (sizebox[hashedKey] != null && sizebox[hashedKey].key.equals(key)) {
//            return hashedKey;
//        }
//
//        // do linear probing
//        int stoppingIndex = hashedKey;
//
//        if (hashedKey == sizebox.length - 1) {
//            hashedKey = 0;
//        } else {
//            hashedKey++;
//        }
//
//        while (hashedKey != stoppingIndex && sizebox[hashedKey] != null
//                    && !sizebox[hashedKey].key.equals(key) ) {
//            hashedKey = (hashedKey + 1) % sizebox.length;
//        }
//
//        if (sizebox[hashedKey] != null && sizebox[hashedKey].key.equals(key))  {
//            return hashedKey;
//        }
//
//        return -1;
//    }
//
//    private boolean isOccupied(int index) {
//        return sizebox[index] != null;
//    }
//
//    public void printsizebox() {
//        for (int i = 0; i < sizebox.length; i++) {
//            if (sizebox[i] != null) {
//                System.out.println("Element " + i + " " + sizebox[i].value);
//            } else {
//                System.out.println("Element " + i + " null");
//            }
//        }
//    }

}
