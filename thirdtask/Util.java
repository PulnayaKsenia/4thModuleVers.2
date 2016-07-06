package com.goit.fourthmodule.thirdtask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Util {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public Point readConsole() throws IOException {
        System.out.println("If you need to count coordinate between point x and y,\n" +
                "please, enter PointX or PointY or Out for exit: ");

        String xy = READER.readLine();
        String[] split;
        switch (xy) {
            case "PointX":
                CoordinatesX x = new CoordinatesX();
                split = readParams(x);

                try {
                    x.setX1(Double.parseDouble(split[0]));
                    x.setX2(Double.parseDouble(split[1]));

                } catch (NumberFormatException ex) {
                    System.out.println("You enter string value, must be number!");
                } return x;

            case "PointY":
                CoordinatesY y = new CoordinatesY();
                split = readParams(y);

                try {
                    y.setY1(Double.parseDouble(split[0]));
                    y.setY2(Double.parseDouble(split[1]));
                } catch (NumberFormatException ex) {
                    System.out.println("You enter string value, must be number!");

                } return y;

            case "Out":
                System.exit(1);
            default:
                readConsole();

        } return null;

    }


    private String[] readParams(Point point) throws IOException {
        System.out.println(point);
        String inputForPoint = READER.readLine();

        return inputForPoint.split(",");

    }

}



