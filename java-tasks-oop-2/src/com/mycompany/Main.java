package com.mycompany;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, java-tasks-oop-2!");
        System.out.println("\nMyComplex Class Test");
        MyComplex c1 = new MyComplex(1.0, Math.sqrt(3));
        MyComplex c2 = new MyComplex(2.0, 5.0);
        MyComplex c3 = new MyComplex(-3.0, 2.0);
        MyComplex c4 = new MyComplex(-3.0, -4.0);
        System.out.println("c1.toString(): " + c1.toString());
        System.out.println("c2.toString(): " + c2.toString());
        System.out.println("c3.toString(): " + c3.toString());
        System.out.println("c4.toString(): " + c4.toString());
        System.out.println("c1.equals(c2): " + c1.equals(c2));
        System.out.println("c2.equals(c3): " + c2.equals(c3));
        System.out.println("c1.isReal(): " + c1.isReal());
        System.out.println("c1.isImaginary(): " + c1.isImaginary());
        System.out.println("c1.magnitude(): " + c1.magnitude());
        System.out.println("c1.argument(): " + c1.argument());
        System.out.println("c1.conjugate(): " + c1.conjugate());
        System.out.println("c1.divide(c2): " + c1.divide(c2));
        System.out.println("c1.substract(c2): " + c1.substract(c2));
        c1.setValue(2.0, 5.0);
        System.out.println("c1.setValue(2.0, 5.0): " + c1);

        System.out.println("\nMyPolynomial Class Test");
        MyPolynomial poly1 = new MyPolynomial(0.0, 1.0, 2.0, 3.0, 4.0);
        MyPolynomial poly2 = new MyPolynomial(0.0);
        MyPolynomial poly3 = new MyPolynomial(1.0, 2.0, 1.0, 5.0);
        System.out.println("poly1.toString(): " + poly1.toString());
        System.out.println("poly2.toString(): " + poly2.toString());
        System.out.println("poly3.toString(): " + poly3.toString());
        System.out.println("poly1.getDegree(): " + poly1.getDegree());
        System.out.println("poly2.getDegree(): " + poly2.getDegree());
        System.out.println("poly1.evaluate(2): " + poly1.evaluate(2));
        System.out.println("poly1.add(poly3): " + poly1.add(poly3));
        System.out.println("poly1.toString(): " + poly1.toString());
        System.out.println("poly3.toString(): " + poly3.toString());
        System.out.println("poly1.multiply(poly3): " + poly1.multiply(poly3));

        System.out.println("\nBall & Container Classes Test");
        Ball ball1 = new Ball(5, 5, 2, 2, 0);
        System.out.println("ball1.toString(): " + ball1.toString());
        Container container = new Container(0, 0, 10, 10);
        System.out.println("container.toString(): " + container.toString());
        System.out.println("container.collides(ball1): " + container.collides(ball1));
        ball1.move();
        System.out.println("ball1 after ball1.move(): " + ball1);
        System.out.println("container.collides(ball1): " + container.collides(ball1));
        ball1.move();
        System.out.println("ball1 after ball1.move(): " + ball1);
        System.out.println("container.collides(ball1): " + container.collides(ball1));
        ball1.move();
        System.out.println("ball1 after ball1.move(): " + ball1);
        System.out.println("container.collides(ball1): " + container.collides(ball1));

    }
}
