package com.company.chapters.chapter4.figures;

import com.company.chapters.chapter2.classes.Point;

public abstract class Shape {
    private Point point;

    public Shape(Point point) {
        this.point = point;
    }

    public Point getPoint() {
        return point;
    }

    public void moveBy(double dx, double dy) {
        point.translate(dx, dy);
    }

    public abstract Point getCenter();
}
