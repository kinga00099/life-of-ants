package com.codecool.ants;

import java.util.Random;

class Worker extends Ants {

    Worker(int x, int y) {
        super(x, y);
    }

    private int[] stepValue = {1, -1};
    private String[] axisValue = {"x","y"};

    private int rollStep() {
        Random random = new Random();
        return random.nextInt(2-1)+1;
    }

    void move() {
        int step = stepValue[rollStep()];
        String axis = axisValue[rollStep()];
        if (axis.equals("x") && this.getPosX()+step <= 100){
            this.setPosX(this.getPosX()+step);
        } else if (axis.equals("y") && this.getPosY()+step <= 100) {
            this.setPosY(this.getPosY()+step);
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
