package com.codecool.ants;

class Soldier extends Ants {
    private int cycleStep = 0;

    Soldier(int x, int y) {
        super(x, y);
    }

    @Override
    public String toString() {
        return String.format("[type:%s, position:%d,%d, disttToQueen:%d]",
                this.getClass().getSimpleName(),
                this.getPosX(),
                this.getPosY(),
                this.distanceToQueen());
    }

    //TODO
    void move() {
        if (cycleStep == 0) {
            cycleStep ++;
            setPosY(getPosY() + 1);
        } else if (cycleStep == 1) {
            cycleStep ++;
            setPosX(getPosX() + 1);
        } else if (cycleStep == 2) {
            cycleStep ++;
            setPosY(getPosY() - 1);
        } else if (cycleStep == 3) {
            cycleStep = 0;
            setPosX(getPosX() - 1);
        }
        System.out.println(this.toString());
    }
}
