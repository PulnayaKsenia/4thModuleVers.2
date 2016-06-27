package com.goit.fourthmodule.thirdtask;

import java.util.Scanner;

public class CoordinatesX {
    public double x1;
    public double x2;

    public double coordinatesX() {
        Scanner scannerx1 = new Scanner(System.in);
        System.out.println("Enter value of point with coordinate x1: ");
        double x1 = scannerx1.nextDouble();

        Scanner scannerx2 = new Scanner(System.in);
        System.out.println("Enter value of point with coordinate x2: ");
        double x2 = scannerx1.nextDouble();

        double x = x2 - x1;
        return x;
    }
}
