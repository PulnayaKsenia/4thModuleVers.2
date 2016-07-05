package com.goit.fourthmodule.secondtask;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Util temperature = new Util();
        Converter converter = temperature.readConsole();

        double calculate = converter.calculate();
        System.out.println(calculate);
    }
}

