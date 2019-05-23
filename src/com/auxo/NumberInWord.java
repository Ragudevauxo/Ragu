package com.auxo;

import java.util.Scanner;

public class NumberInWord {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        printNumberInWord(number);
    }

    public static void printNumberInWord(int number) {
        String Numbers[] = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "OTHER"};
        System.out.println((number <= 9 && number >= 0) ? Numbers[number] : Numbers[Numbers.length - 1]);
    }
}
