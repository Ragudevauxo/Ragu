package com.auxo.oops;

public class ComplexNumber {
    private double real;
    private double imaginary;

    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(int x, int y) {
        this.real = real + x;
        this.imaginary = imaginary + y;
    }

    public void add(ComplexNumber x) {
        this.real = real + x.real;
        this.imaginary = imaginary + x.imaginary;
    }

    public void subtract(int x, int y) {
        this.real = real - x;
        this.imaginary = imaginary - y;
    }

    public void subtract(ComplexNumber y) {
        this.real = real - y.real;
        this.imaginary = imaginary - y.imaginary;
    }

    public static void main(String[] args) {
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1, 1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
    }
}
