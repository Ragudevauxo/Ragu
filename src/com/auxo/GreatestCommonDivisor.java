package com.auxo;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers to check which is greatest common divisor");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println(getGreatestCommondivisor(number1, number2));
    }

    public static int getGreatestCommondivisor(int number1, int number2) {

        if ((isValid(number1)) && (isValid(number2))) {
            if (number1 % number2 == 0) {
                return number2;
            } else {
                return getGreatestCommondivisor(number2, number1 % number2);
            }
        }
        return -1;
    }

    public static boolean isValid(int number) {
        if (number >= 10) {
            return true;
        }
        return false;
    }
}
