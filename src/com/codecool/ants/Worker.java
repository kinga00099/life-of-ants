package com.codecool.ants;

class Worker extends Ants {

    Worker(int x, int y) {
        super(x, y);
    }

    //TODO
    void move() {
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
