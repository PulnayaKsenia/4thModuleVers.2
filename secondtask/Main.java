package com.goit.fourthmodule.secondtask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CelsiusFarenheit cf = new CelsiusFarenheit();
        System.out.println("Conversion temperature from Celsius to Fahrenheit: "+cf.celsiusFarenheit());


        FarenheitCelsius fc = new FarenheitCelsius();
        System.out.println("Conversion temperature from Fahrenheit to Celsius: "+fc.fahrenheitCelsius());
    }
}
