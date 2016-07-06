package com.goit.fourthmodule.secondtask;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Util {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public Converter readConsole() throws IOException {
        System.out.println("If you need to convert the different scale of temperature,\n" +
                "please, choose the know temperature scale: Celsius or Fahrenheit or enter Out for exit: ");

        String s = READER.readLine();
        String[] split;
        switch (s) {
            case "Celsius":
                CelsiusFahrenheit celsiusFahrenheit = new CelsiusFahrenheit();
                split = readParams(celsiusFahrenheit);
                try {
                    Double celsius = Double.parseDouble(split[0]);
                    celsiusFahrenheit.setCelsius(celsius);
                } catch (NumberFormatException ex) {
                    System.out.println("You enter string value, must be number!");
                }

                return celsiusFahrenheit;

            case "Fahrenheit":
                FahrenheitCelsius fahrenheitCelsius = new FahrenheitCelsius();
                split = readParams(fahrenheitCelsius);
                try {
                    Double fahrenheit = Double.parseDouble(split[0]);
                    fahrenheitCelsius.setFahrenheit(fahrenheit);
                } catch (NumberFormatException ex) {
                    System.out.println("You enter string value, must be number!");
                }
                return fahrenheitCelsius;
            case "Out":
                System.exit(1);
            default:
                readConsole();
        }
        return null;
    }

    private String[] readParams(Converter converter) throws IOException {
        System.out.println(converter);
        String inputForConverter = READER.readLine();

        return inputForConverter.split(",");
    }
}
