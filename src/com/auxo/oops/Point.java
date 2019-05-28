package com.auxo.oops;

public class Point {
    private int x;
    private int y;

    Point() {
        System.out.println("first constructor is called");
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {

        double res = Math.sqrt((x - 0) * (x - 0) + (y - 0) * (y - 0));
        return res;
    }

    public double distance(Point p) {

        double res = Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
        return res;
    }

    public double distance(int p1, int p2) {

        double res = Math.sqrt((x - p1) * (x - p1) + (y - p2) * (y - p2));
        return res;
    }

    public static void main(String[] args) {
        Point obj1 = new Point(6, 5);
        Point obj2 = new Point(3, 1);
        System.out.println("The distance is: " + obj1.distance());
        System.out.println("The distance is: " + obj1.distance(obj2));
        System.out.println("The distance is: " + obj1.distance(2, 2));
        Point point = new Point();
        System.out.println("The distance is: " + point.distance());

    }
}
