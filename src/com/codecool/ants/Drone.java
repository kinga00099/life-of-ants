package com.codecool.ants;

class Drone extends Ants {
    Drone(int x, int y) {
        super(x, y);
    }

    void move() {
    }

    void mate() {
    }

    @Override
    public String toString() {
        return String.format("type:%s, position:%d,%d",
                this.getClass().getSimpleName(),
                this.getPosX(),
                this.getPosY());
    }
}
