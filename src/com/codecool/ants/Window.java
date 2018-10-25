package com.codecool.ants;

import javax.swing.*;

public class Window {

    Window() {
        JFrame frame = new JFrame("Life of the Ants");
        frame.add(new Panel());
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
