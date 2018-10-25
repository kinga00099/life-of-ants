package com.codecool.ants;

import java.awt.*;
import java.util.Random;

class Worker extends Ants {

    Worker(int x, int y) {
        super(x, y);
        Panel.fillAnt(x, y, Color.CYAN);
    }

    private int rollStep() {
        Random random = new Random();
        return random.nextInt(2);
    }

    void move() {
        Panel.fillAnt(getPosX(), getPosY(), Color.BLACK);
        int[] stepValue = {3, -3};
        String[] axisValue = {"x", "y"};
        int step = stepValue[rollStep()];
        String axis = axisValue[rollStep()];
        if (axis.equals("x") && Math.abs(getPosX() + step) <= 300) {
            this.setPosX(this.getPosX() + step);
            Panel.fillAnt(getPosX(), getPosY(), Color.CYAN);
        } else if (axis.equals("y") && Math.abs(getPosY() + step) <= 300) {
            this.setPosY(this.getPosY() + step);
            Panel.fillAnt(getPosX(), getPosY(), Color.CYAN);
        } else {
            move();
        }
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
