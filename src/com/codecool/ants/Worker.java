package com.codecool.ants;

import java.util.Random;

class Worker extends Ants {

    Worker(int x, int y) {
        super(x, y);
    }

    private int[] stepValue = {1, -1};
    private String[] axisValue = {"x","y"};

    int rollStep() {
        Random random = new Random();
        return random.nextInt(2-1)+1;
    }


    //TODO
    void move() {
        int step = stepValue[rollStep()];
        String axis = axisValue[rollStep()];

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
