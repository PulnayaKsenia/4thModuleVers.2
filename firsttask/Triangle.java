package com.goit.fourthmodule.firsttask;

import java.util.Scanner;

class Triangle extends GeometricFigure {

    private double base;
    private double height;

    public double getBase() {

        return base;
    }

    public void setBase(double base) {

        this.base = base;
    }

    public double getHeight() {

        return height;
    }

    public void setHeight(double height) {

        this.height = height;
    }

    @Override
    public String getFigureType() {
        return "Triangle";
    }

    @Override
    public String getInitialParams() {

        return "base and height of triangle: ";
    }

    @Override
    public double calculate() {

        return 0.5*height*base;
    }

}

