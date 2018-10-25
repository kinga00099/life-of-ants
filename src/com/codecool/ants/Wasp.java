package com.codecool.ants;

import java.awt.*;
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
        isThereAWasp = randomNumber.nextInt(100) == 0;
    }

    Wasp(int x, int y){
        this.setX(x);
        this.setY(y);
        Panel.fillAnt(x,y, Color.YELLOW);
    }

    static boolean isThereAWasp() {
        return isThereAWasp;
    }

    static void killWasp(){
        isThereAWasp = false;
    }


    public String toString() {
        return String.format("[type:%s, position:%d,%d]",
                this.getClass().getSimpleName(),
                getX(),
                getY());
    }
}
