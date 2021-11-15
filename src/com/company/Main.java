package com.company;

import com.company.chapters.chapter1.Chapter1;
import com.company.chapters.chapter2.Chapter2;
import com.company.chapters.chapter2.classes.Point;
import com.company.chapters.chapter3.Chapter3;
import com.company.chapters.chapter4.Chapter4;
import com.company.chapters.chapter4.figures.Circle;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n###############################\nChapter2");
        System.out.println("\nEx1");
        Chapter1.printBinaryOctalHexadecimal();
        System.out.println("\nEx2");
        Chapter1.checkNumberInRange();
        System.out.println("\nEx3");
        Chapter1.largestNumber();
        System.out.println("\nEx4");
        Chapter1.smallestAndMaxPositiveDouble();
        System.out.println("\nEx6");
        Chapter1.factorialOfNumber();
        System.out.println("\nEx13");
        Chapter1.lottery();
        System.out.println("\n###############################\nChapter2");
        System.out.println("\nEx5");
        Chapter2.pointClass();
        System.out.println("\nEx9");
        Chapter2.carClass();
        System.out.println("\n###############################\nChapter3");
        System.out.println("\nEx1");
        Chapter3.avgSalary();
        System.out.println("\nEx2");
        Chapter3.largestSalary();
        System.out.println("\n###############################\nChapter4");
        System.out.println("\nEx4");
        Chapter4.shapeInterface();
        System.out.println("\nEx5");
        Circle cir = new Circle(new Point(100,200),300);
        System.out.println(cir);
        Chapter4.cloneForShape();
    }
}
