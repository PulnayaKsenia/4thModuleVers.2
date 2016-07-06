package com.goit.fourthmodule.thirdtask;

import java.util.Scanner;

class CoordinatesX extends Point {
    public double x1;
    public double x2;

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    @Override
    public String getPoint() {
        return "CoordinatesX";
    }

    @Override
    public String getCoordinates() {
        return "enter coordinates x1 and x2: ";
    }

    @Override
    public double calculate() {
        return x2 - x1;
    }


}
