package com.codecool.ants;

import java.util.Random;

class Wasp {
    private static boolean isThereAWasp = false;
    private int x, y;

    int getX() {
        return x;
    }

    private void setX(int x) {
        this.x = x;
    }

    int getY() {
        return y;
    }

    private void setY(int y) {
        this.y = y;
    }

    static void setWasp() {
        Random randomNumber = new Random();
        isThereAWasp = randomNumber.nextInt(100) + 1 <= 10;
    }

    Wasp(int x, int y){
        this.setX(x);
        this.setY(y);
    }

    static boolean isThereAWasp() {
        return isThereAWasp;
    }
}
