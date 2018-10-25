package com.codecool.ants;

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
    }

    void move() {
        if (timesteps > 0) {
            timesteps--;
        }
    }

    static boolean wantToMate() {
        Random random = new Random();
        return random.nextInt(101) < 10;
    }


    @Override
    public String toString() {
        return String.format("[type:%s, position:%d,%d]",
                this.getClass().getSimpleName(),
                this.getPosX(),
                this.getPosY());
    }
}
