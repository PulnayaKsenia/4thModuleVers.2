package com.goit.fourthmodule.firsttask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShapeUtil {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    enum Figures {Circle, Rectangle, Triangle, Out}

    public GeometricFigure readConsole() throws IOException {

        System.out.println("If you need to calculate the square of geometric figures,\n " +
                "please, choose type of geometric figure: Circle, Triangle, Rectangle or enter Out for exit: ");
        String figure = READER.readLine();

        Figures figures;

        figures = Figures.Circle;

        String[] split;
        switch (figures) {
            case Circle:
                Circle circle = new Circle();
                split = readParams(circle);
                try {
                    circle.setRadius(Double.parseDouble(split[0]));
                } catch (NumberFormatException ex) {
                    System.out.println("You enter string value, must be number!");

                    if (circle == null) {
                        break;
                    }
                }
                System.out.println(circle);
                return circle;

            case Triangle:
                Triangle triangle = new Triangle();
                split = readParams(triangle);
                try {
                    triangle.setHeight(Double.parseDouble(split[0]));
                    triangle.setBase(Double.parseDouble(split[1]));
                } catch (NumberFormatException ex) {
                    System.out.println("You enter string value, must be number!");

                }
                return triangle;

            case Rectangle:
                Rectangle rectangle = new Rectangle();
                split = readParams(rectangle);
                try {
                    rectangle.setHeightR(Double.parseDouble(split[0]));
                    rectangle.setLength(Double.parseDouble(split[1]));
                } catch (NumberFormatException ex) {
                    System.out.println("You enter string value, must be number!");
                }
                return rectangle;

            case Out:
                System.exit(1);
            default:
                readConsole();
        }
        return null;
    }

    private String[] readParams(GeometricFigure figure) throws IOException {
        System.out.println(figure);
        String inputForGeometricFigure = READER.readLine();

        return inputForGeometricFigure.split(",");
    }

}
