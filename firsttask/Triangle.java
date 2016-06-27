package com.goit.fourthmodule.firsttask;

import java.util.Scanner;

public class Triangle {
    public double base;
    public double height;
    public double coefficient = 0.5;

    public double squareTriangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value base of a triangle: ");
        double base = scanner.nextDouble();

        System.out.println("Enter value height of a triangle: ");
        double height = scanner.nextDouble();

        double sTriangle = coefficient * base * height;
        return sTriangle;
    }
}
