package com.codecool.ants;

import java.awt.*;
import java.util.Random;

class Queen extends Ants {
    private static int timesteps = 0;

    public static void setTimesteps(int timesteps) {
        Queen.timesteps = timesteps;
    }

    public static int getTimesteps() {
        return timesteps;
    }

    Queen(int x, int y) {
        super(x, y);
        Panel.fillAnt(x,y, Color.MAGENTA);
    }

    void move() {
        Panel.fillAnt(getPosX(),getPosY(), Color.MAGENTA);
        if (timesteps > 0) {
            timesteps--;
        }
    }

    static boolean wantToMate() {
        Random random = new Random();
        return random.nextInt(101) < 50;
    }


    @Override
    public String toString() {
        return String.format("[type:%s, position:%d,%d]",
                this.getClass().getSimpleName(),
                this.getPosX(),
                this.getPosY());
    }
}
