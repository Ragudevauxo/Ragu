package com.auxo;

import java.util.Scanner;
import java.util.regex.Pattern;

public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number to check");
        int number = scanner.nextInt();
        System.out.println(isPalindrome(number));
    }

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number = number * -1;
        }
        String numberStr = String.valueOf(number);


        StringBuilder stringBuilder = new StringBuilder(numberStr);
        String compareNumber = stringBuilder.reverse().toString();

        if (numberStr.equals(compareNumber)) {
            return true;
        }


        return false;
    }
}
