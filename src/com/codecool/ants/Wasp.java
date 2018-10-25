package com.codecool.ants;

import java.util.Random;

class Wasp {
    private static boolean isThereAWasp = false;
    static private int x, y;

    static int getX() {
        return x;
    }

    private void setX(int x) {
        Wasp.x = x;
    }

    static int getY() {
        return y;
    }

    private void setY(int y) {
        Wasp.y = y;
    }

    static void setWasp() {
        Random randomNumber = new Random();
        isThereAWasp = randomNumber.nextInt(100) + 1 <= 5;
    }

    Wasp(int x, int y){
        this.setX(x);
        this.setY(y);
    }

    static boolean isThereAWasp() {
        return isThereAWasp;
    }


    public String toString() {
        return String.format("[type:%s, position:%d,%d]",
                this.getClass().getSimpleName(),
                getX(),
                getY());
    }
}
