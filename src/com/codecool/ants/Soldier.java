package com.codecool.ants;

class Soldier extends Ants {
    private int cycleStep = 0;

    Soldier(int x, int y) {
        super(x, y);
    }

    @Override
    public String toString() {
        return String.format("[type:%s, position:%d,%d, cyclestep:%d]",
                this.getClass().getSimpleName(),
                this.getPosX(),
                this.getPosY(),
                this.cycleStep);
    }

    //TODO
    void move() {
    }
}