package com.goit.fourthmodule.firsttask;

import com.sun.javaws.jnl.ResourcesDesc;
import com.sun.prism.shader.Solid_ImagePattern_Loader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();
        System.out.println("SQUARE OF A CIRCLE: " + circle.squareCircle());

        Triangle triangle = new Triangle();
        System.out.println("SQUARE OF A TRIANGLE: " + triangle.squareTriangle());

        Rectangle rectangle = new Rectangle();
        System.out.println("SQUARE OF A RECTANGLE: " + rectangle.squareRectangle());

    }
}
