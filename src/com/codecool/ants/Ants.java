package com.codecool.ants;

abstract class Ants {
    private int posX;
    private int posY;

    int getPosX() {
        return posX;
    }

    int getPosY() {
        return posY;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    abstract void move();

    int distanceToQueen(){
        return  Math.abs(posX) + Math.abs(posY);
    }

    Ants(int x, int y){
        setPosX(x);
        setPosY(y);
    }

}
