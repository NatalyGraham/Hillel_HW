package ua.hillel.javaElementary.HW09.triangle.utils;

import ua.hillel.javaElementary.HW09.triangle.model.Point;

public class GeometryCalc {

    public static double calculateSqrLength(Point p1, Point p2) {
        return Math.pow(Math.abs(p1.getCoordinateX() - p2.getCoordinateX()), 2) + Math.pow(Math.abs(p1.getCoordinateY() - p2.getCoordinateY()), 2);
    }

    public static double calculateLength(Point p1, Point p2) {
        return Math.sqrt(calculateSqrLength(p1, p2));
    }

    /*public static double calculateArea (double length1, double length2, double length3){
        double semiPerimeter = calculatePerimeter(length1, length2, length3);
        return Math.sqrt(semiPerimeter*(semiPerimeter-length1)*(semiPerimeter-length2)*(semiPerimeter*length3));
    }//*/

    /*public static double calculatePerimeter (double length1, double length2, double length3){
        return length1 + length2 + length3;
    }//*/

}

