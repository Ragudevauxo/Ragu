package com.auxo;

import java.util.Scanner;

public class EvenDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        System.out.println(getEvenDigitSum(number));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int a[] = new int[String.valueOf(number).length()];
        int i = 0;
        while (number != 0) {
            int rem = number % 10;
            a[i] = rem;
            number = number / 10;
            i++;
        }
        int sum = 0;
        for (int count = 0; count <= a.length - 1; count++) {
            if (a[count] % 2 == 0) {
                sum += a[count];
                count++;
            }
        }

        return sum;
    }
}
