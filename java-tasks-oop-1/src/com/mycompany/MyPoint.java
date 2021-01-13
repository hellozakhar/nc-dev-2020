package com.mycompany;

import java.util.Objects;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] array = new int[2];
        array[0] = x;
        array[1] = y;
        return array;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double distance(int x, int y) {
        double dst = Math.sqrt(Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2));
        return dst;
    }

    public double distance(MyPoint point) {
        double dst = Math.sqrt(Math.pow((point.getX() - this.x), 2) + Math.pow((point.getY() - this.y), 2));
        return dst;
    }

    public double distance() {
        double dst = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
        return dst;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyPoint)) return false;
        MyPoint myPoint = (MyPoint) o;
        return getX() == myPoint.getX() && getY() == myPoint.getY();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY());
    }
}
