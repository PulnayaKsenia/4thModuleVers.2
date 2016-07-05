package com.goit.fourthmodule.firsttask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShapeUtil {

    public static final BufferedReader BUFFERED_READER = new BufferedReader(new InputStreamReader(System.in));

    public GeometricFigure readConsole() throws IOException {
        System.out.println("If you need to calculate the square of geometric figures,\n " +
                "please, choose type of geometric figure: Circle, Triangle, Rectangle or enter Out for exit: ");

        String figure = BUFFERED_READER.readLine();
        String[] split;
        switch (figure) {
            case "Circle":
                Circle circle = new Circle();
                split = readParams(circle);
                try {
                    circle.setRadius(Double.parseDouble(split[0]));
                } catch (NumberFormatException ex) {

                    //не пойму, какой метод вызывать, чтобы программа не выбрасывала 0.0,
                    // а заново запрашивала ввести данные
                    System.out.println("You enter string value, must be number!");

                } return circle;

            case "Triangle":
                Triangle triangle = new Triangle();
                split = readParams(triangle);
                try {
                    triangle.setHeight(Double.parseDouble(split[0]));
                    triangle.setBase(Double.parseDouble(split[1]));
                } catch (NumberFormatException ex) {
                    System.out.println("You enter string value, must be number!");

                }
                return triangle;

            case "Rectangle":
                Rectangle rectangle = new Rectangle();
                split = readParams(rectangle);
                try {
                    rectangle.setHeightR(Double.parseDouble(split[0]));
                    rectangle.setLength(Double.parseDouble(split[1]));
                } catch (NumberFormatException ex) {
                    System.out.println("You enter string value, must be number!");
                }
                return rectangle;

            case "Out":
                System.exit(1);
            default:
                readConsole();
        }
        return null;
    }

    private String[] readParams(GeometricFigure figure) throws IOException {
        System.out.println(figure);
        String inputForGeometricFigure = BUFFERED_READER.readLine();

        return inputForGeometricFigure.split(",");
    }

}
