package com.company.chapters.chapter2;

import com.company.chapters.chapter2.classes.Car;
import com.company.chapters.chapter2.classes.Point;

public class Chapter2 {
    public static void pointClass() {
        Point p = new Point(3,4).translate(1,3).scale(0.5);
        System.out.println(p);
    }

    public static void carClass() {
        Car car = new Car(0,55,50);
        car.drive(50);
        car.refillFuel(1);
        car.drive(50);
        car.refillFuel(70);
        car.drive(1000);
        car.drive(10000);
    }
}
