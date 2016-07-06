package com.goit.fourthmodule.thirdtask;

import java.util.Scanner;

class CoordinatesY extends Point{
    public double y1;
    public double y2;

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    @Override
    public String getPoint() {
        return "CoordinatesY";
    }

    @Override
    public String getCoordinates() {
        return "enter coordinates y1 and y2: ";
    }

    @Override
    public double calculate() {
        return y2 - y1;
    }

}

