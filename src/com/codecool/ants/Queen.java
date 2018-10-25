package com.codecool.ants;

import java.util.Random;

class Queen extends Ants {
    private int timesteps = 0;

    Queen(int x, int y) {
        super(x, y);
        System.out.println("wanna mate? "+wantToMate());
    }

    void move() {
        if (timesteps > 0) {
            timesteps--;
        }
    }

    //TODO
    boolean wantToMate() {
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
