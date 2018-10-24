package com.codecool.ants;

class Worker extends Ants {

    public Worker(int x, int y) {
        super(x, y);
    }

    void move() {

    }

    @Override
    public String toString() {
        return String.format("type:%s, position:%d,%d",
                this.getClass().getSimpleName(),
                this.getPosX(),
                this.getPosY());
    }
}
