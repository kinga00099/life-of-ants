package com.codecool.ants;

import javax.swing.*;

public class Window {

    Window(Panel panel) {
        JFrame frame = new JFrame("Life of the Ants");
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
