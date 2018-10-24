package com.codecool.ants;

abstract class Ants {
    private int posX;
    private int posY;

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    private void setPosition(int x, int y) {
        this.posX = x;
        this.posY = y;
    }

    //TODO
    abstract void move();


    public int distanceToQueen(){
        return 0;
    }


    Ants(int x, int y){
        setPosition(x, y);
    }

}
