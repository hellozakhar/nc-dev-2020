package com.mycompany.ballgraphics;

import javax.swing.JFrame;

public class MainGraphicsBall {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Where is the Ball?");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Container Custom Properties
        int windowWidth = 700;
        int windowHeight = 700;

        // Ball Custom Properties
        int radius = 20;
        int speed = 21;
        int direction = 42;

        BallPanel panel = new BallPanel(0, 0, windowWidth, windowHeight, 500, 500, radius, speed, direction);
        frame.add(panel);
        frame.setSize(windowWidth, windowHeight);
        frame.setVisible(true);
    }
}
