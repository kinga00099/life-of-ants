package com.codecool.ants;

import java.awt.*;

import java.util.Random;

class Soldier extends Ants {
    private int cycleStep = 0;

    Soldier(int x, int y) {
        super(x, y);
        Panel.fillAnt(x,y, Color.RED);
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

    int distanceToWasp() {
        return Math.abs((Wasp.getX() - this.getPosX()) + (Wasp.getY() - this.getPosY()));
    }


    void moveToWasp(Panel panel) {
        while (this.getPosX() != Wasp.getX()){
            Panel.fillAnt(getPosX(),getPosY(), Color.BLACK);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (this.getPosX() > Wasp.getX()) {
                setPosX(getPosX() - 1);
            } else {
                setPosX(getPosX() + 1);
            }
            Panel.fillAnt(getPosX(),getPosY(), Color.RED);
            panel.repaint();
        }

        while (this.getPosY() != Wasp.getY()){
            if (getPosY() > Wasp.getY()) {
                setPosY(getPosY() - 1);
            } else {
                setPosY(getPosY() + 1);
            }
        }
        Panel.fillAnt(getPosX(),getPosY(), Color.RED);
    }

    void attackWasp() {
        System.out.println("HAJIME");
        Random random = new Random();
        setPosX(random.nextInt(101));
        setPosY(random.nextInt(101));
    }

    void move() {
        Panel.fillAnt(getPosX(),getPosY(), Color.BLACK);
        if (cycleStep == 0) {
            cycleStep++;
            setPosY(getPosY() + 1);
        } else if (cycleStep == 1) {
            cycleStep++;
            setPosX(getPosX() + 1);
        } else if (cycleStep == 2) {
            cycleStep++;
            setPosY(getPosY() - 1);
        } else if (cycleStep == 3) {
            cycleStep = 0;
            setPosX(getPosX() - 1);
        }
        Panel.fillAnt(getPosX(),getPosY(), Color.RED);
    }
}
