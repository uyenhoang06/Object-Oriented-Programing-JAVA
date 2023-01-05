package exercise1.exercise1_7;

public class MyComplex {

    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {

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
        return "(" + this.real + " + " + this.imag + "i)";
    }

    public boolean isReal() {
        return imag == 0.0;
    }

    public boolean isImaginary() {
        return real == 0.0;
    }

    public boolean equals(double real, double imag) {
        return (this.real == real && this.imag == imag);
    }

    public boolean equals(MyComplex another) {
        return (this.real == another.real && this.imag == another.imag);
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    public double argument() {
        return Math.atan2(this.imag, this.real);
    }

    public MyComplex add(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real + right.real, this.imag + right.imag);
    }

    public MyComplex subtract(MyComplex right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(this.real - right.real, this.imag - right.imag);
    }

    public MyComplex multiply(MyComplex right) {
        this.real = this.real * right.real - this.imag * right.imag;
        this.imag = this.real * right.imag + this.imag * right.real;
        return this;
    }

    public MyComplex multiplyNew(MyComplex right) {
        return new MyComplex(this.real * right.real - this.imag * right.imag, this.real * right.imag + this.imag * right.real);
    }

    public MyComplex divide(MyComplex right) {
        double anotherSq = right.getReal() * right.getReal() + right.getImag() * right.getImag();
        this.setReal(this.multiply(right).getReal() / anotherSq);
        this.setImag(this.multiply(right).getImag() / anotherSq);
        return this;
    }

    public MyComplex divideNew(MyComplex right) {
        MyComplex newComplex = new MyComplex();
        newComplex.real = (this.real * right.real + this.imag * right.imag) / (right.real * right.real + right.imag * right.imag);
        newComplex.imag = (this.real * right.imag - this.imag * right.real) / (right.real * right.real + right.imag * right.imag);
        return newComplex;
    }

    public MyComplex conjugate() {
        return new MyComplex(this.real, -this.imag);
    }
}
