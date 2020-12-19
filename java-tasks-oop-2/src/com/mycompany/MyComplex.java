package com.mycompany;

import java.util.Objects;

public class MyComplex {
    private double real;
    private double imag;

    public MyComplex() {
        real = 0.0;
        imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {

        return imag < 0 ? "(" + real + imag + "i)" : "(" + real + '+' + imag + "i)";
    }

    public boolean isReal() {
        return real != 0.0;
    }

    public boolean isImaginary() {
        return imag != 0.0;
    }

    public boolean equals(double real, double imag) {

        return this.real == real && this.imag == imag;
    }


    public boolean equals(MyComplex c) {

        return real == c.real && imag == c.imag;
    }

    public double magnitude() {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imag, 2));
    }

    public double argument() {
        return Math.atan(imag / real);
    }

    public MyComplex add(MyComplex right) {
        real += right.real;
        imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real + right.real, this.imag + right.imag);
    }

    public MyComplex substract(MyComplex right) {
        real -= right.real;
        imag -= right.imag;
        return this;
    }

    public MyComplex substractNew(MyComplex right) {
        return new MyComplex(this.real - right.real, this.imag - right.imag);
    }

    public MyComplex multiply(MyComplex right) {
        // z1 = a + bi
        // z2 = c + di
        // z1 * z2 = (a+bi)(c+di) = (ac - bd) + (ad + bc) * i

        double resultReal = real * right.real - imag * right.imag;
        double resultImag = real * right.imag + imag * right.real;

        this.setValue(resultReal, resultImag);

        return this;
    }

    public MyComplex divide(MyComplex right) {
        //      a + bi    (ac + bd) + (bc - ad) * i
        // z = -------- = -------------------------
        //      c + di          c^2 + d^2

        double resultReal = (real * right.real + imag * right.imag) / (Math.pow(right.real, 2) + Math.pow(right.imag, 2));
        double resultImag = (imag * right.real - real * right.imag) / (Math.pow(right.real, 2) + Math.pow(right.imag, 2));

        this.setValue(resultReal, resultImag);

        return this;
    }

    public MyComplex conjugate() {

        imag = - imag;

        return this;
    }

}
