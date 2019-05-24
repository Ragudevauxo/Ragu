package com.auxo;

import java.util.Scanner;

public class fourPackProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers ");
        int bigCount = scanner.nextInt();
        int smallCount = scanner.nextInt();
        int goal = scanner.nextInt();
        System.out.println(canPack(bigCount, smallCount, goal));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount >= 0) && (smallCount >= 0) && (goal >= 0)) {


            bigCount = bigCount * 5;
            if ((bigCount == goal) || (smallCount == goal)) {
                return true;
            } else if (bigCount < goal) {
                if (bigCount + smallCount >= goal) {
                    return true;
                }
                return false;
            } else {
                int count = 5;
                while (bigCount > goal) {
                    bigCount = bigCount - count;
                    count += 5;
                }
                if (bigCount + smallCount >= goal) {
                    return true;
                }
            }
        }
        return false;
    }
}

