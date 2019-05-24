package com.auxo;

import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = scanner.nextInt();
        numberToWords(number);
    }

    public static void numberToWords(int number) {
        int rem = 0, i=0;
        int a[]=new int[Integer.toString(number).length()];
        String arr[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        if (number > 0) {
            while (number != 0) {
                rem = number % 10;
                number = number / 10;
                a[i]=rem;
                i++;
            }
            for(i=a.length-1;i>=0;i--)
            {
                System.out.println(arr[a[i]]);
            }
        }
        else
        {
            System.out.println("invalid");
        }
    }
}
