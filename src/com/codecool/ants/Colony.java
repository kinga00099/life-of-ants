package com.codecool.ants;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Colony {
    private static List<Ants> ants = new ArrayList<>();

    private static void createColony() {
        Queen queen = new Queen(0, 0);
        ants.add(queen);
        for (int i = 0; i < 10 ; i++) {
            ants.add(new Worker(rollPosition(), rollPosition()));
        }
        for (int i = 0; i < 4 ; i++) {
            ants.add(new Soldier(rollPosition(), rollPosition()));
        }
        for (int i = 0; i < 2; i++) {
            ants.add(new Drone(rollPosition(), rollPosition()));
        }
    }

    private static int rollPosition() {
        Random random = new Random();
        return random.nextInt(101 - (-100)) - 100;
    }

    private static void printColony() {
        System.out.println(ants.toString());
    }

    private static void simulateColony(){
        for (int i = 0; i < 500; i++) {
            Wasp.setWasp();
            for (Ants ant : ants){
                if (!Wasp.isThereAWasp()) {
                    ant.move();
                } else {
                    System.out.println("WAAASP");
                    Wasp wasp = new Wasp(rollPosition(),rollPosition());
                }
            }
        }
    }

    public static void main(String[] args) {
        createColony();
        printColony();
        simulateColony();
    }
}
