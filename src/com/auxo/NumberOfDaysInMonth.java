package com.auxo;

import java.util.Scanner;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println("Enter the year to check leap year or not");
        Scanner scanner = new Scanner(System.in);
        int Year = scanner.nextInt();
        System.out.println(isLeapYear(Year));
        System.out.println("Enter the month");
        int month = scanner.nextInt();
        System.out.println("Enter the year");
        int year2 = scanner.nextInt();
        System.out.println(getDaysInMonth(month, year2));
    }

    public static boolean isLeapYear(int year) {
        boolean flag = false;
        if (year < 1 || year > 9999) {
            return flag;
        }
        if ((year % 4 == 0)) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    flag = true;
                } else {
                    flag = false;
                }
            } else {
                flag = true;
            }
        }
        return flag;
    }

    public static int getDaysInMonth(int month, int year2) {
        if ((year2 < 1 || year2 > 9999) || (month < 1 || month > 28)) {
            return -1;
        }

        if (month % 2 == 0 && month != 2) {
            return 30;
        } else if (month % 2 != 0) {
            return 31;
        } else if (month == 2) {
            if ((year2 % 4 == 0) && (year2 % 100 != 0)) {
                return 29;
            } else if ((year2 % 4 == 0) && (year2 % 100 == 0) && (year2 % 400 == 0)) {
                return 29;
            } else {
                return 28;
            }

        }

        return 0;
    }
}
