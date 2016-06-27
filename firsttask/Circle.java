package com.goit.fourthmodule.firsttask;

import java.util.Scanner;

public class Circle {
    public double radius;
    public double PI;

    public double squareCircle() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius of a circle: ");
        double radius = scanner.nextDouble();

        double sCircle = Math.PI*radius*radius;
        return sCircle;

}
}
