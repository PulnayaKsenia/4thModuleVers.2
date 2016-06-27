package com.goit.fourthmodule.secondtask;

import java.util.Scanner;

public class FarenheitCelsius {

    public double f;

    public static double fahrenheitCelsius() {
        Scanner fahrenheit = new Scanner(System.in);
        System.out.println("Enter value temperature in Fahrenheit: ");
        double f = fahrenheit.nextDouble();


        double fc = (f - 32) * 5 / 9;
        return fc;
    }
}
