package com.goit.fourthmodule.thirdtask;

import java.util.Scanner;

public class CoordinatesY {
    public double y1;
    public double y2;

    public double coordinatesY() {
        Scanner scannery1 = new Scanner(System.in);
        System.out.println("Enter value of point with coordinate y1: ");
        double y1 = scannery1.nextDouble();

        Scanner scannery2 = new Scanner(System.in);
        System.out.println("Enter value of point with coordinate y2: ");
        double y2 = scannery2.nextDouble();

        double y = y2 - y1;
        return y;
    }

}

