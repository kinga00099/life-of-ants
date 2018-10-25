package com.codecool.ants;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Colony {
    private static List<Ants> ants = new ArrayList<>();

    private static void createAnts() {
        Queen queen = new Queen(0, 0);
        ants.add(queen);
        Worker worker1 = new Worker(rollPosition(), rollPosition());
        ants.add(worker1);
        Soldier soldier1 = new Soldier(rollPosition(), rollPosition());
        ants.add(soldier1);
        Drone drone1 = new Drone(rollPosition(), rollPosition());
        ants.add(drone1);
    }

    private static int rollPosition() {
        Random random = new Random();
        return random.nextInt(101 - (-100)) - 100;
    }

    private static void printAnts() {
        System.out.println(ants.toString());
    }

    public static void main(String[] args) {
        createAnts();
        printAnts();
        System.out.println(ants.get(0).distanceToQueen());
        System.out.println(ants.get(1).distanceToQueen());
        System.out.println(ants.get(2).distanceToQueen());
    }
}
