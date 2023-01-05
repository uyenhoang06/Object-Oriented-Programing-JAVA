package com.oop.collections.polynominals;

public interface Poly {
    Poly derivative();

    double[] coefficients();

    double coefficient(int degree);

    int degree();
}
