package com.company.chapters.chapter2.classes;

public class Car {
    private double fuel;
    private final double maxFuel;
    private final int mpg;

    public Car(double fuel, double maxFuel, int mpg) {
        this.maxFuel = maxFuel;
        if (fuel > maxFuel) this.fuel = maxFuel;
        else this.fuel = fuel;
        this.mpg = mpg;
    }

    public void drive(double x) {
        if(fuel == 0) {
            System.out.println("We can't drive. Fuel tank is empty");
            return;
        }
        System.out.println("Fuel before driving: " + fuel);
        double lostFuel = x/mpg;
        if (lostFuel>fuel)
        fuel -= lostFuel;
        System.out.println("Fuel after driving: " + fuel + "\nWe driving " + x +" miles");
    }

    public void refillFuel(double fuel) {
        if (fuel < 0) return;
        if (this.maxFuel - this.fuel <= fuel) {
            this.fuel = this.maxFuel;
            System.out.println("Tank is full: " + fuel + " gallons");
        }
        else {
            this.fuel += fuel;
            System.out.println("Tank: " + fuel + " gallons");
        }
    }
}
