package com.goit.fourthmodule.firsttask;

import java.util.Scanner;

public class Rectangle {
    public double length;
    public double height;

     public double squareRectangle() {
         Scanner scanner = new Scanner(System.in);

         System.out.println("Enter length of a rectangle: ");
         double length = scanner.nextDouble();

         System.out.println("Enter height of a rectangle: ");
         double height = scanner.nextDouble();

        double sRectangle = length*height;
        return sRectangle;


    }
}
