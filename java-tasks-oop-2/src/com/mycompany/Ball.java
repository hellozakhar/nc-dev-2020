package com.mycompany;

import java.util.Objects;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        xDelta = (float) (speed * Math.cos(direction % 180));
        yDelta = (float) (speed * Math.sin(- direction % 180));
        // simple solution with -0.0 is: - sin(x) = sin(-x)
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getXDelta() {
        return xDelta;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move() {
        x += xDelta;
        y += yDelta;
    }

    public void reflectHorizontal() {
        xDelta = - xDelta;
    }

    public void reflectVertical() {
        yDelta = - yDelta;
    }

    @Override
    public String toString() {
        return "Ball[(" + x +", " + y + "),speed=(" + xDelta + "," + yDelta + ")]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ball)) return false;
        Ball ball = (Ball) o;
        return Float.compare(ball.getX(), getX()) == 0 && Float.compare(ball.getY(), getY()) == 0 && getRadius() == ball.getRadius() && Float.compare(ball.xDelta, xDelta) == 0 && Float.compare(ball.yDelta, yDelta) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY(), getRadius(), xDelta, yDelta);
    }
}
