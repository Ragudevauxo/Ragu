package com.auxo;

import java.util.Scanner;

public class PaintJob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        double areaperbucket = scanner.nextDouble();
        double area=width*height;
        int extrabuckets = scanner.nextInt();
        System.out.println(getBucketCount(width, height, areaperbucket, extrabuckets));
        System.out.println(getBucketCount(width, height, areaperbucket));
        System.out.println(getBucketCount(area, areaperbucket));
    }

    public static int getBucketCount(double width, double height, double areaperbucket, int extrabuckets) {
        if ((width > 0) && (height > 0) && (areaperbucket > 0) && (extrabuckets > 0)) {
            double area = width * height;
            double TotalBucket = areaperbucket * extrabuckets;
            double rem = area - TotalBucket;
            double bucketneed = Math.ceil(rem / areaperbucket);
            return (int) bucketneed;
        }
        return -1;
    }

    public static int getBucketCount(double width, double height, double areaperbucket) {
        if ((width > 0) && (height > 0) && (areaperbucket > 0)) {
            double area = width * height;
            double bucketneed = Math.ceil(area / areaperbucket);
            return (int) bucketneed;
        }
        return -1;
    }

    public static int getBucketCount(double area, double areaperbucket) {
        if (area > 0 && areaperbucket > 0) {
            return (int) Math.ceil(area / areaperbucket);
        }
        return -1;
    }

}
