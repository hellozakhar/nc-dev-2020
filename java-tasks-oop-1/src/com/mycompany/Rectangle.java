package com.mycompany;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle() {
        length = 1.0f;
        width = 1.0f;
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        double area = length * width;
        return area;
    }

    public double getPerimeter() {
        double perimeter = (length + width) * 2;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "length=" + length +
                ",width=" + width +
                ']';
    }
}