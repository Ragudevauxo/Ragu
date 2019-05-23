package com.auxo;

import java.util.Scanner;

public class LastDigitChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers to check ur number last digit equal to other number last digit");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        System.out.println(hasSameLastDigit(number1, number2, number3));
        System.out.println("Enter the number to check if its valid");
        int number4 = scanner.nextInt();
        System.out.println(isValid(number4));
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        if (isValid(number1) && isValid(number2) && isValid(number3)) {
            if ((number1 % 10) == (number2 % 10) || (number1 % 10) == (number3 % 10) || (number2 % 10) == (number3 % 10)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean isValid(int number) {
        if (number >= 10 && number <= 1000) {
            return true;
        } else {
            return false;
        }
    }
}
