package com.goit.fourthmodule.secondtask;

import java.util.Scanner;

public class CelsiusFarenheit {

    double c;

    public double celsiusFarenheit() {
        Scanner celsius = new Scanner(System.in);
        System.out.println("Enter value of temperature in Celsius: ");
        double c = celsius.nextDouble();

        double cf = (c * 9 / 5) + 32;
        return cf;
    }
}
