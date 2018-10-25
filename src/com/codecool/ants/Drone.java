package com.codecool.ants;

import java.util.Random;

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
        if (distanceToQueen() <= 3 && Queen.wantToMate() && Queen.getTimesteps() == 0) {
            this.mate();
        } else if (distanceToQueen() <= 3) {
            System.out.println("D’OH");
            Random random = new Random();
            while (distanceToQueen() != 100) {
                setPosX(random.nextInt(101));
                setPosY(random.nextInt(101));
            }
        }
    }

    void mate() {
        Random random = new Random();
        Queen.setTimesteps(random.nextInt(101) + 100);
        System.out.println("HALLELUJAH!");
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
