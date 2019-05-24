package com.auxo;

import java.util.Scanner;

public class Diagonalstar {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        printSquareStar(number);
    }

    public static void printSquareStar(int number) {
        if (number >= 5) {
            for (int row = 0; row < number; row++) {
                for (int column = 0; column < number; column++) {
                    if (row == 0 || column == 0 || row == number - 1 || column == number - 1) {
                        System.out.print("*");
                        continue;
                    } else if (row == column) {
                        System.out.print("*");
                        continue;
                    } else if (column == (number - (row + 1))) {
                        System.out.print("*");
                        continue;
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("invalid");
        }
    }
}