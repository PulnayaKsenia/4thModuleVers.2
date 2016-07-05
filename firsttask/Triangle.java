package com.goit.fourthmodule.firsttask;

import java.util.Scanner;

class Triangle extends GeometricFigure {

    public double base;
    public double height;


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
        return this.getClass().toString();
    }

    @Override
    public String getInitialParams() {
        return "enter base and height of triangle: ";
    }

    @Override
    public double calculate() {
        return 0.5*height*base;
    }

}

