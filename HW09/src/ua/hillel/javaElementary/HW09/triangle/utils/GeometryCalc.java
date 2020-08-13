package ua.hillel.javaElementary.HW09.triangle.utils;

import ua.hillel.javaElementary.HW09.triangle.model.Point;

public class GeometryCalc {

    public static double calculateSqrLength(Point p1, Point p2) {
        return Math.pow(Math.abs(p1.getCoordinateX() - p2.getCoordinateX()), 2) + Math.pow(Math.abs(p1.getCoordinateY() - p2.getCoordinateY()), 2);
    }

    public static double calculateLength(Point p1, Point p2) {
        return Math.sqrt(calculateSqrLength(p1, p2));
    }

}

