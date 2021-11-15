package com.company.chapters.chapter3;

import com.company.chapters.chapter3.classes.Employee;
import com.company.chapters.chapter3.classes.Measurable;

public class Chapter3 {
    public static void avgSalary() {
        Employee boss = new Employee(100000);
        System.out.println("Average salary of employees (without boss): " +
                boss.average(new Measurable[]{new Employee(1000), new Employee(10000), new Employee(5000)}));
        System.out.println("Average salary of employees (with boss): " +
                boss.average(new Measurable[]{new Employee(1000), new Employee(10000), new Employee(5000), boss}));

    }

    public static void largestSalary() {
        Employee boss = new Employee(100000);
        System.out.println("Max salary of employees (without boss): " +
                boss.average(new Measurable[]{new Employee(1000), new Employee(10000), new Employee(5000)}));
        System.out.println("Max salary of employees (with boss): " +
                boss.large(new Measurable[]{new Employee(1000), new Employee(10000), new Employee(5000), boss}));
    }
}
