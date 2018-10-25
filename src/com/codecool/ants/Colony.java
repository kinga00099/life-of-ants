package com.codecool.ants;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Colony {
    private static List<Ants> ants = new ArrayList<>();

    private static void createColony() {
        Queen queen = new Queen(0, 0);
        ants.add(queen);
        for (int i = 0; i < 10; i++) {
            ants.add(new Worker(rollPosition(), rollPosition()));
        }
        for (int i = 0; i < 4; i++) {
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

    private static void simulateColony(Panel panel) {
        for (int i = 0; i < 500; i++) {
            try {
                panel.repaint();
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Wasp.setWasp();
            if (Wasp.isThereAWasp()) {
                Wasp wasp = new Wasp(rollPosition(), rollPosition());
                while (Wasp.isThereAWasp()) {
                    try {
                        panel.repaint();
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    for (Ants ant : ants) {
                        if (ant instanceof Soldier) {
                            ((Soldier) ant).moveToWasp();
                            if (!Wasp.isThereAWasp()){
                                break;
                            }
                        }
                    }
                }
            }
            for (Ants ant : ants) {
                ant.move();
            }

        }
    }

    private static Integer getNearestSoldier() {
        List<Integer> distanceOfWasp = new ArrayList<>();
        for (Ants ant : ants) {
            if (ant instanceof Soldier) {
                distanceOfWasp.add(((Soldier) ant).distanceToWasp());
            }
        }
        Collections.sort(distanceOfWasp);
        return distanceOfWasp.get(0);
    }

    public static void main(String[] args) {
        Panel panel = new Panel();
        new Window(panel);
        createColony();
        simulateColony(panel);
        printColony();

    }
}
