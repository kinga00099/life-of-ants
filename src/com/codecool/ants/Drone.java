package com.codecool.ants;

class Drone extends Ants {
    Drone(int x, int y) {
        super(x, y);
    }

    void move() {
        if (distanceToQueen() > 0 && Math.abs(getPosX()) > 0) {
            if (getPosX() > 0) {
                setPosX(getPosX() - 1);
            } else {
                setPosX(getPosX() + 1);
            }
        } else if (distanceToQueen() > 0) {
            if (getPosY() > 0) {
                setPosY(getPosY() - 1);
            } else {
                setPosY(getPosY() + 1);
            }
        }
        System.out.println(this.toString());
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
