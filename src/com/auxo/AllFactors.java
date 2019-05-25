package com.auxo;

import java.util.Scanner;

public class AllFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        printFactors(number);
    }
    public static void printFactors(int number)
    {
        if(number>1) {
            for (int count = 1; count <= 6; count++) {
                if (number % count == 0) {
                    System.out.println(count);
                }
            }
        }
        else
        {
            System.out.println("Invalid ");
        }

}}
