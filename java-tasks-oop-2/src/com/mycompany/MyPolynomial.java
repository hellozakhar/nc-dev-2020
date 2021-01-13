package com.mycompany;

import java.util.Arrays;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = new double[coeffs.length];

        for (int i = 0; i < coeffs.length; i++) {
            this.coeffs[i] = coeffs[i];
        }
    }

    public int getDegree() {
        int degree = 0;
        try {
            degree = coeffs.length - 1;
        } catch (NullPointerException e) {
            return 0;
        }
        return degree;
    }

    @Override
    public String toString() {
        StringBuilder polynomial = new StringBuilder();
        int polyDegree = getDegree();

        for (int i = 0; i < polyDegree; i++) {
            polynomial.append(coeffs[polyDegree - i]);
            polynomial.append("x^");
            polynomial.append(polyDegree - i);
            polynomial.append("+");
        }

        polynomial.append(coeffs[0]);

        return polynomial.toString();
    }

    public double evaluate(double x) {
        double result = 0.0;
        int polyDegree = getDegree();

        for (int i = 0; i < polyDegree; i++) {
            result += coeffs[i] * Math.pow(x, polyDegree - i);
        }

        result += coeffs[polyDegree];

        return result;
    }

    public MyPolynomial add(MyPolynomial right) {
        int maxDegree = Math.max(this.getDegree(), right.getDegree());
        double[] tmpCoeffs = new double[maxDegree + 1];

        for (int i = 0; i <= this.getDegree(); i++) {
            tmpCoeffs[i] = this.coeffs[i];
        }

        for (int i = 0; i <= right.getDegree(); i++) {
            tmpCoeffs[i] += right.coeffs[i];
        }

        return new MyPolynomial(tmpCoeffs);
    }

    public MyPolynomial multiply(MyPolynomial right) {

        int leftDegree = this.getDegree();
        int rightDegree = right.getDegree();
        double[] tmpCoeffs = new double[leftDegree + rightDegree + 1];


        for (int i = 0; i <= leftDegree; i++) {
            for (int j = 0; j <= rightDegree; j++) {
                tmpCoeffs[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }

        return new MyPolynomial(tmpCoeffs);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyPolynomial)) return false;
        MyPolynomial that = (MyPolynomial) o;
        return Arrays.equals(coeffs, that.coeffs);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(coeffs);
    }
}
