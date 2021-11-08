package com.company.chapters.chapter4;

import com.company.chapters.chapter2.classes.Point;
import com.company.chapters.chapter4.figures.Circle;
import com.company.chapters.chapter4.figures.Line;
import com.company.chapters.chapter4.figures.Rectangle;
import com.company.chapters.chapter4.figures.Shape;

public class Chapter4 {
    public static void ex4() {
        Shape[] shapes = new Shape[]{new Rectangle(new Point(3, 4), 50, 100)
                , new Circle(new Point(200, 300), 50)
                , new Line(new Point(20, 30), new Point(100, 200))
        };

        for (Shape shape : shapes) {
            System.out.println("Shape before \"moveBy\": " + shape);
            System.out.println("Center of shape: " + shape.getCenter());
            shape.moveBy(300,200);
            System.out.println("Shape after \"moveBy\": " + shape);
            System.out.println("Center of shape: " + shape.getCenter());
        }
    }

    public static void ex5() {
        Circle circle = new Circle(new Point(3,4),10);
        Circle circle1 = (Circle)circle.clone();
        System.out.println(circle + "\tCopy: " + circle1);
        circle1.setRadius(15);
        System.out.println(circle + "\tCopy: " + circle1);
        Rectangle rectangle = new Rectangle(new Point(3,4),40,50);
        Rectangle rectangle1 = (Rectangle) rectangle.clone();
        System.out.println(rectangle+ "\tCopy: " + rectangle1);
        rectangle1.setHeight(15);
        rectangle1.setWidth(30);
        System.out.println(rectangle+ "\tCopy: " + rectangle1);
        Line line = new Line(new Point(), new Point(5,2));
        Line newLine = (Line) line.clone();
        System.out.println(line+ "\tCopy: " + newLine);
    }
}
