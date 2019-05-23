package com.auxo;

import java.math.BigInteger;
import java.util.Scanner;

public class SumOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        System.out.println(isOdd(number));
        System.out.println("Enter two number");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println(sumOdd(number1, number2));
    }

    public static boolean isOdd(int number) {
        if ((number > 0) && (number % 2 != 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd(int number1, int number2) {
        if ((number2 >= number1) && (number1 > 0)) {
            int value = 0;
            for (int count = number1; count <= number2; count++) {
                if (count % 2 != 0) {
                    value = value + count;
                }
            }
            return value;
        }
        return -1;
    }
}
