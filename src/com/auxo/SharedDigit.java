package com.auxo;

import java.util.Scanner;

public class SharedDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println(hasSharedDigit(number1, number2));
    }

    public static boolean hasSharedDigit(int number1, int number2) {
        if (isRange(number1) && isRange(number2)) {
            if ((number1 % 10) == (number2 % 10) || (number1 / 10) == (number2 % 10))
                if ((number2 % 10) == (number2 / 10) || (number2 / 10) == (number1 % 10)) {
                    return true;
                } else {
                    return false;
                }
            else {
                return false;
            }
        }
        return false;
    }

    public static boolean isRange(int number) {
        if (number >= 10 && number <= 99) {
            return true;
        } else {
            return false;
        }
    }

}

