package com.mycompany;

import java.util.Objects;

public class MyTriangle extends MyPoint {

    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = new MyPoint(v1.getX(), v1.getY());
        this.v2 = new MyPoint(v2.getX(), v2.getY());
        this.v3 = new MyPoint(v3.getX(), v3.getY());
    }

    @Override
    public String toString() {
        return "MyTriangle[" +
                "v1=" + v1 +
                ",v2=" + v2 +
                ",v3=" + v3 +
                ']';
    }

    public double getPerimeter() {
        double perimeter = v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
        return perimeter;
    }

    public String getType() {

        String type;
        double A = v1.distance(v2);
        double B = v2.distance(v3);
        double C = v3.distance(v1);

        if (A == B && B == C && C == A) {
            type = "Equilateral";
        }
        else if (A == B || B == C || C == A) {
            type = "Isosceles";
        } else {
            type = "Scalene";
        }

        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyTriangle)) return false;
        if (!super.equals(o)) return false;
        MyTriangle that = (MyTriangle) o;
        return Objects.equals(v1, that.v1) && Objects.equals(v2, that.v2) && Objects.equals(v3, that.v3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), v1, v2, v3);
    }
}
