package com.company.chapters.chapter4.figures;

import com.company.chapters.chapter2.classes.Point;

public class Line extends Shape {
    private Point endPoint;

    public Line(Point from, Point to) {
        super(from);
        endPoint = to;
    }

    @Override
    public void moveBy(double dx, double dy) {
        super.moveBy(dx, dy);
        endPoint.translate(dx,dy);
    }

    @Override
    public Point getCenter() {
        return new Point((super.getPoint().getX()+endPoint.getX())/2,(super.getPoint().getY()+endPoint.getY())/2);
    }

    @Override
    public Object clone() {
        Line newLine = null;
        try {
            newLine = (Line) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Line(super.getPoint(),endPoint);
        }
        return newLine;
    }

    @Override
    public String toString() {
        return "Line{" +
                "From=" + super.getPoint() +
                ", To=" + endPoint +
                '}';
    }
}
