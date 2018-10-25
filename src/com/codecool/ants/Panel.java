package com.codecool.ants;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Panel extends JPanel {

    private BufferedImage canvas;

    public Panel() {
        canvas = new BufferedImage(800, 800, BufferedImage.TYPE_INT_ARGB);
        fillCanvas(Color.BLACK);
        fillAnt(400,400, Color.RED);

    }

    public Dimension getPreferredSize() {
        return new Dimension(canvas.getWidth(), canvas.getHeight());
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(canvas, null, null);
    }

    public void fillAnt(int posX, int posY, Color c) {
        int color = c.getRGB();
        for (int x = posX; x < posX + 5; x++) {
            for (int y = posY; y < posY + 5; y++) {
                canvas.setRGB(x, y, color);
            }
        }
        repaint();
    }

    public void fillCanvas(Color c) {
        int color = c.getRGB();
        for (int x = 0; x < canvas.getWidth(); x++) {
            for (int y = 0; y < canvas.getHeight(); y++) {
                canvas.setRGB(x, y, color);
            }
        }
        repaint();
    }
}
