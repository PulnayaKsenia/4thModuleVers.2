package com.goit.fourthmodule.firsttask;

class Circle extends GeometricFigure {

    private double radius;


    public double squareCircle() {

        return Math.PI * radius * radius;
    }

    public double getRadius() {

        return radius;
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }


    @Override
    public String getFigureType() {

        return this.getClass().toString();
    }

    @Override
    public String getInitialParams() {
        return "enter radius of square: ";
    }

    @Override
    public double calculate() {
        return Math.PI * radius * radius;
    }

}
