package com.codecool.ants;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Panel extends JPanel {

    private static BufferedImage canvas;

    public Panel() {
        canvas = new BufferedImage(850, 850, BufferedImage.TYPE_INT_ARGB);
        fillCanvas(Color.BLACK);

    }

    public Dimension getPreferredSize() {
        return new Dimension(canvas.getWidth(), canvas.getHeight());
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(canvas, null, null);
    }

    public static void fillAnt(int posX, int posY, Color c) {
        int color = c.getRGB();
        int posXGraphical = 400 + posX;
        int posYGraphical = 400 + posY;
        for (int x = posXGraphical; x < posXGraphical + 8; x++) {
            for (int y = posYGraphical; y < posYGraphical + 8; y++) {
                canvas.setRGB(x, y, color);
            }
        }
    }

    public static void fillCanvas(Color c) {
        int color = c.getRGB();
        for (int x = 0; x < canvas.getWidth(); x++) {
            for (int y = 0; y < canvas.getHeight(); y++) {
                canvas.setRGB(x, y, color);
            }
        }
    }
}
