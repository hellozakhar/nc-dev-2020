package com.mycompany;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height) {
        x1 = x;
        y1= y;
        x2 = x + width;
        y2 = y + height;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return x2 - x1;
    }

    public int getHeight() {
        return y2 - y1;
    }

    public boolean collides(Ball ball) {

        if (ball.getY() + ball.getRadius() <= this.getY() || ball.getY() + ball.getRadius() > this.getHeight())
        {
            return true;
        }

        if (ball.getX() + ball.getRadius() <= this.getX() || ball.getX() + ball.getRadius() > this.getWidth())
        {
            return true;
        }
        return false;
    }

    // additional method for ballgraphics

    public boolean collidesWidth(Ball ball) {
        if (ball.getX() + ball.getXDelta() - ball.getRadius() <= this.getX() || ball.getX() + ball.getXDelta() + ball.getRadius() > this.getWidth())
        {
            return true;
        }
        return false;
    }

    public boolean collidesHeight(Ball ball) {
        if (ball.getY() + ball.getYDelta() - ball.getRadius() <= this.getY() || ball.getY() + ball.getYDelta() + ball.getRadius() > this.getHeight())
        {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Container[" +
                "(" + x1 +
                "," + y1 +
                "),(" + x2 +
                "," + y2 +
                ")]";
    }
}
