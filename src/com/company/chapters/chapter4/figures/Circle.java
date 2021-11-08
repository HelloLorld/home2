package com.company.chapters.chapter4.figures;

import com.company.chapters.chapter2.classes.Point;

public class Circle extends Shape implements Cloneable {
    private double radius;

    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return super.getPoint();
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public Object clone() {
        Circle newCircle = null;
        try {
            newCircle = (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            return newCircle = new Circle(super.getPoint(),this.radius);
        }
        return newCircle;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", center=" + super.getPoint() +
                '}';
    }
}
