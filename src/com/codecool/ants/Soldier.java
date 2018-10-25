package com.codecool.ants;

import java.awt.*;

import java.util.Random;

class Soldier extends Ants {
    private int cycleStep = 0;

    Soldier(int x, int y) {
        super(x, y);
        Panel.fillAnt(x, y, Color.RED);
    }

    @Override
    public String toString() {
        return String.format("[type:%s, position:%d,%d, distToQueen:%d, distToWasp:%d]",
                this.getClass().getSimpleName(),
                this.getPosX(),
                this.getPosY(),
                this.distanceToQueen(),
                this.distanceToWasp());
    }

    private int distanceToWasp() {
        return Math.abs((Wasp.getX() - this.getPosX()) + (Wasp.getY() - this.getPosY()));
    }


    void moveToWasp() {
        Panel.fillAnt(getPosX(), getPosY(), Color.BLACK);
        if (getPosX() != Wasp.getX()) {
            if (this.getPosX() > Wasp.getX()) {
                setPosX(getPosX() - 1);
            } else {
                setPosX(getPosX() + 1);
            }
        } else {
            if (getPosY() > Wasp.getY()) {
                setPosY(getPosY() - 1);
            } else {
                setPosY(getPosY() + 1);
            }
        }
        Panel.fillAnt(getPosX(), getPosY(), Color.RED);

        if (isOnWasp()) {
            attackWasp();
        }
    }

    private boolean isOnWasp() {
        return getPosX() == Wasp.getX() && getPosY() == Wasp.getY();
    }


    private void attackWasp() {
        System.out.println("HAJIME");
        Wasp.killWasp();
        Panel.fillAnt(getPosX(), getPosY(), Color.BLACK);
        Random random = new Random();
        setPosX(random.nextInt(101));
        setPosY(random.nextInt(101));
    }

    void move() {
        Panel.fillAnt(getPosX(), getPosY(), Color.BLACK);
        if (cycleStep == 0) {
            cycleStep++;
            setPosY(getPosY() + 2);
        } else if (cycleStep == 1) {
            cycleStep++;
            setPosX(getPosX() + 2);
        } else if (cycleStep == 2) {
            cycleStep++;
            setPosY(getPosY() - 2);
        } else if (cycleStep == 3) {
            cycleStep = 0;
            setPosX(getPosX() - 2);
        }
        Panel.fillAnt(getPosX(), getPosY(), Color.RED);
    }
}
