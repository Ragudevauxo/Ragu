package com.auxo;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check if its perfect number");
        int number = scanner.nextInt();
        System.out.println(isPerfectNumber(number));
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        if (number > 0) {
            for (int count = 1; count < number; count++) {
                if ((number % count) == 0) {
                    sum += count;
                }
            }
            if (sum == number) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}