package com.auxo;

import java.util.Scanner;

public class LargestPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to get the largest prime ");
        int number = scanner.nextInt();
        System.out.println(getLargestPrime(number));
    }

    public static int getLargestPrime(int number) {

        if (number > 0) {
            int j = 0;
            for (int i = number / 2; i > 2; i--) {
                if (isPrime(i) && number % i == 0) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static boolean isPrime(int number) {
        if (number > 1) {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}