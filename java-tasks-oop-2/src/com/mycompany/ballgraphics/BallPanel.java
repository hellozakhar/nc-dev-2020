package com.mycompany.ballgraphics;

import com.mycompany.Ball;
import com.mycompany.Container;

import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.Timer;

class BallPanel extends JPanel implements ActionListener
{
    private int delay = 10;
    private int ballDiameter;
    protected Timer timer;

    private Container container;
    private Ball ball;

    public BallPanel()
    {
        container = new Container(0, 0, 1000, 1000);
        ball = new Ball(500, 500, 100, 200, 30);
        ballDiameter = ball.getRadius() * 2;
        timer = new Timer(delay, this);
        timer.start();        // start the timer
    }

    public BallPanel(int posX1, int posY1, int width, int height, float x, float y, int radius, int speed, int direction)
    {
        container = new Container(posX1, posY1, width, height);
        ball = new Ball(x, y, radius, speed, direction);
        ballDiameter = ball.getRadius() * 2;
        timer = new Timer(delay, this);
        timer.start();        // start the timer
    }

    public void actionPerformed(ActionEvent e)
    {
        repaint();
    }

    public void paintComponent( Graphics g )    // determine ball position
    {
        super.paintComponent(g);
        g.setColor(Color.black);

//        if (ball.getY() <= container.getY() || ball.getY() > getHeight())
//        {
//            ball.reflectVertical();
//        }
//
//        if (ball.getX() <= container.getX() || ball.getX() > container.getWidth())
//        {
//            ball.reflectHorizontal();
//        }

        if (container.collidesHeight(ball))
        {
            ball.reflectVertical();
        }

        if (container.collidesWidth(ball))
        {
            ball.reflectHorizontal();
        }

        ball.move();
        g.fillOval((int) ball.getX(), (int) ball.getY(), ballDiameter, ballDiameter);
    }

}
