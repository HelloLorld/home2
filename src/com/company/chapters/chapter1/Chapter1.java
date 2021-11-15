package com.company.chapters.chapter1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Chapter1 {

    public static void printBinaryOctalHexadecimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        System.out.println("Binary: " + Integer.toBinaryString(number));
        System.out.println("Octal: " + Integer.toOctalString(number));
        System.out.println("Hex: " + Integer.toHexString(number));
        System.out.println("RevHex: " + Double.toHexString(1.0 / number));
    }

    public static void checkNumberInRange() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int normalizeNumber = scanner.nextInt();
        if (normalizeNumber >= 0 && normalizeNumber <= 359) System.out.println("Number is ok");
        else System.out.println("Number is not ok");
    }

    public static void largestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int min, max;
        if (num1 < num2 && num1 < num3) min = num1;
        else if (num2 < num1 && num2 < num3) min = num2;
        else min = num3;
        if (num1 > num2 && num1 > num3) max = num1;
        else if (num2 > num1 && num2 > num3) max = num2;
        else max = num3;
        System.out.println("Min: " + min + "\nMax: " + max);
        min = 0;
        max = 0;
        System.out.println("With Math\nMin: " + Math.min(num1, Math.min(num2, num3)) + "\nMax: "
                + Math.max(num1, Math.max(num2, num3)));
    }

    public static void smallestAndMaxPositiveDouble() {
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
    }

    public static void factorialOfNumber() {
        System.out.println("Укажите число:");
        BigInteger factorial = new BigInteger("1");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 0) System.out.println("Нельзя посчитать");
        else if (n == 0 || n == 1) System.out.println("Факториал равен: 1");
            else {
                for (int i = 2; i <= n; i++)
                    factorial = factorial.multiply(new BigInteger(Integer.toString(i)));
                System.out.println("Ваш факториал равен: " + factorial);
            }
        factorial = new BigInteger("1");
        for (int i = 2; i <= 1000; i++)
            factorial = factorial.multiply(new BigInteger(Integer.toString(i)));
        System.out.println("Факториал 1000 равен: " + factorial);
    }

    public static void lottery() {
        ArrayList<Integer> lottery = new ArrayList<>();
        for (int i=1;i<=49;i++)
            lottery.add(i);
        ArrayList<Integer> wonCombination = new ArrayList<>();
        int max = 49;
        for (int i =0;i<6;i++) {
            int index = (int)(Math.random()*max);
            wonCombination.add(lottery.get(index));
            lottery.remove(index);
            max--;
        }
        Collections.sort(wonCombination);
        for (int num : wonCombination)
            System.out.print(num + "\t");
    }
}
