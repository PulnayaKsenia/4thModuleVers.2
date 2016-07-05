package com.goit.fourthmodule.firsttask;

import java.io.IOException;

public class Runner {

    public static void main(String[] args) throws IOException {
        ShapeUtil shape = new ShapeUtil();
        GeometricFigure figure = shape.readConsole();

        double calculate = figure.calculate();
        System.out.println(calculate);

    }
}
