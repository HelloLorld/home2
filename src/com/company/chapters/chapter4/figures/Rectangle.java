package com.company.chapters.chapter4.figures;

import com.company.chapters.chapter2.classes.Point;

public class Rectangle extends Shape implements Cloneable{
    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft);
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {
        return new Point(super.getPoint().getX()+width/2,super.getPoint().getY()+height/2);
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public Object clone() {
        Rectangle newRectangle = null;
        try {
            newRectangle = (Rectangle) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Rectangle(super.getPoint(),width,height);
        }
        return newRectangle;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", topLeft=" + super.getPoint() +
                '}';
    }
}
