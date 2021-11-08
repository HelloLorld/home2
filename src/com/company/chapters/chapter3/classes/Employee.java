package com.company.chapters.chapter3.classes;

import java.util.ArrayList;

public class Employee implements Measurable {
    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    @Override
    public double getMeasurable() {
        return salary;
    }

    public double average(Measurable[] employees) {
        double sum = 0;
        for (Measurable emp : employees)
            sum += emp.getMeasurable();
        return sum/employees.length;
    }

    public double large(Measurable[] employees) {
        ArrayList<Employee> employeesList = new ArrayList<>();
        double max = 0;
        for (Measurable emp : employees) {
            if (emp instanceof Employee) employeesList.add((Employee) emp);
        }
        for (Employee emp : employeesList) {
            double salary = emp.getMeasurable();
            if (salary > max) max = emp.getMeasurable();
        }
        return max;
    }
}
