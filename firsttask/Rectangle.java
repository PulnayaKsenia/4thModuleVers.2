package com.goit.fourthmodule.firsttask;

import java.util.Scanner;

class Rectangle extends GeometricFigure {

    public double length;
    public double height;

    public double getLength() {

        return length;
    }

    public void setLength(double length) {

        this.length = length;
    }

    public double getHeight() {

        return height;
    }

    public void setHeightR(double height) {

        this.height = height;
    }

    @Override
    public String getFigureType() {
        return this.getClass().toString();
    }

    @Override
    public String getInitialParams() {
        return "enter length and height of rectangle: ";
    }

    @Override
    public double calculate() {
        return length * height;
    }

}

