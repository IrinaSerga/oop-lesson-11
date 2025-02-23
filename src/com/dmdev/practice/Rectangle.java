package com.dmdev.practice;

public class Rectangle {

     private Point topLeft;
     private Point bottomRight;


    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }
    public double getDiagonal() {
        return topLeft.distance(bottomRight);
    }
    public int getArea() {
        return (bottomRight.getX() - topLeft.getX()) * (topLeft.getY() - bottomRight.getY());
    }

}
