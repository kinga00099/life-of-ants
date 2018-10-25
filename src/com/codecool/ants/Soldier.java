package com.codecool.ants;

import java.awt.*;

class Soldier extends Ants {
    private int cycleStep = 0;

    Soldier(int x, int y) {
        super(x, y);
        Panel.fillAnt(x,y, Color.RED);
    }

    @Override
    public String toString() {
        return String.format("[type:%s, position:%d,%d, disttToQueen:%d]",
                this.getClass().getSimpleName(),
                this.getPosX(),
                this.getPosY(),
                this.distanceToQueen());
    }

    void move() {
        Panel.fillAnt(getPosX(),getPosY(), Color.BLACK);
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
        Panel.fillAnt(getPosX(),getPosY(), Color.RED);
    }
}
