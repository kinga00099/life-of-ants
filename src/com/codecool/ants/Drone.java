package com.codecool.ants;

class Drone extends Ants {
    Drone(int x, int y) {
        super(x, y);
    }

    //TODO
    void move() {
    }

    //TODO
    void mate() {
    }

    @Override
    public String toString() {
        return String.format("[type:%s, position:%d,%d, disttToQueen:%d]",
                this.getClass().getSimpleName(),
                this.getPosX(),
                this.getPosY(),
                this.distanceToQueen());
    }
}
