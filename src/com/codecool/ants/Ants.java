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

    private void setPosition(int x, int y) {
        this.posX = x;
        this.posY = y;
    }
    
    abstract void move();

    int distanceToQueen(){
        return  Math.abs(posX) + Math.abs(posY);
    }

    Ants(int x, int y){
        setPosition(x, y);
    }

}
