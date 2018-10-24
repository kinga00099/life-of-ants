package com.codecool.ants;

class Queen extends Ants {
    private int timesteps;

    Queen(int x, int y) {
        super(x, y);
    }

    //TODO
    void move() {
    }

    //TODO
    boolean wantToMate() {
        return true;
    }

    //TODO
    int setCountDown() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("type:%s, position:%d,%d",
                this.getClass().getSimpleName(),
                this.getPosX(),
                this.getPosY());
    }
}
