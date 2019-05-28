package com.auxo.oops;

public class Wall {
    private double width;
    private double height;

    Wall() {
        System.out.println("first constructor");
    }

    Wall(double height, double width) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width >= 0) {
            this.width = width;
        } else {
            this.width = 0;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height >= 0) {
            this.height = height;
        } else {
            this.height = 0;
        }
    }

    public double getArea() {
        return height * width;
    }

    public static void main(String[] args) {
        Wall obj = new Wall(5.5, 5.5);
        System.out.println("Height is: " + obj.getHeight());
        System.out.println("width is: " + obj.getWidth());
        System.out.println("Area is: " + obj.getArea());
        obj.setHeight(4.5);
        obj.setWidth(4.5);
        System.out.println("Area of second values: " + obj.getArea());
    }
}
