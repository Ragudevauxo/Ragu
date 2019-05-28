package com.auxo.oops;

import java.util.Scanner;


public class SumCalculator {
    private double firstnumber;
    private double secondnumber;

    public double getFirstnumber() {

        return firstnumber;
    }

    public void setFirstnumber(double firstnumber) {
        this.firstnumber = firstnumber;
    }

    public double getSecondnumber() {
        return secondnumber;
    }

    public void setSecondnumber(double secondnumber) {
        this.secondnumber = secondnumber;
    }

    public double getAdditionResult() {
        return firstnumber + secondnumber;
    }

    public double getSubtractionResult() {
        return firstnumber - secondnumber;
    }

    public double getMultiplicationResult() {
        return firstnumber * secondnumber;
    }

    public double getDivisionResult() {
        if (secondnumber > 0) {
            return firstnumber / secondnumber;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        SumCalculator obj = new SumCalculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        obj.setFirstnumber(scanner.nextInt());
        System.out.println("Enter the second number");
        obj.setSecondnumber(scanner.nextInt());
        System.out.println("Add= " + obj.getAdditionResult());
        System.out.println("subtraction= " + obj.getSubtractionResult());
        System.out.println("Multiply= " + obj.getMultiplicationResult());
        System.out.println("Divide= " + obj.getDivisionResult());
    }

}

