package ua.hillel.javaElementary.HW09.triangle.model;

import ua.hillel.javaElementary.HW09.triangle.utils.GeometryCalc;


public class Triangle extends Figure {

    private double length12;
    private double length23;
    private double length13;

    private Point point1;
    private Point point2;
    private Point point3;


    public Triangle(Point p1, Point p2, Point p3) {
        this.point1 = p1;
        this.point2 = p2;
        this.point3 = p3;
        initializeTriangle();
    }

    private void initializeTriangle() {
        length12 = GeometryCalc.calculateLength(point1, point2);
        length23 = GeometryCalc.calculateLength(point2, point3);
        length13 = GeometryCalc.calculateLength(point1, point3);
    }


    public double calculateArea() {
        double semiPerimeter = calculatePerimeter()/2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - length12) * (semiPerimeter - length23) * (semiPerimeter - length13));
    }

    public double calculatePerimeter() {
        return length12 + length23 + length13;
    }

    public boolean isEquilateral() {
        return isFigure() && (length12 == length23 && length12 == length13);
    }

    public boolean isIsosceles() {
        return isFigure() && (isEquilateral() || (length12 == length23) || (length12 == length13 || (length13 == length23)));
    }

    public boolean isRight() {
        return isFigure() && ((GeometryCalc.calculateSqrLength(point1, point2) == (GeometryCalc.calculateSqrLength(point1, point3) + GeometryCalc.calculateSqrLength(point2, point3))) ||
                (GeometryCalc.calculateSqrLength(point1, point3) == (GeometryCalc.calculateSqrLength(point1, point2) + GeometryCalc.calculateSqrLength(point2, point3))) ||
                (GeometryCalc.calculateSqrLength(point2, point3) == (GeometryCalc.calculateSqrLength(point1, point2) + GeometryCalc.calculateSqrLength(point1, point3))));
    }

    public boolean isArbitrary() {
        return isFigure() && (!isEquilateral() && !isIsosceles() && !isRight());
    }


    @Override
    public boolean isFigure() {
        return ((length12 + length23) > length13 && (length13 + length23) > length12 && (length12 + length13) > length23);
    }

    @Override
    public String toString() {
        if (isFigure()) {
            return "Triangle [[" + point1.getCoordinateX() + ", " + point1.getCoordinateY() + "], [" + point2.getCoordinateX() + ", " + point2.getCoordinateY() + "], [" +
                    point3.getCoordinateX() + ", " + point3.getCoordinateY() + "]]. Its perimeter is " + calculatePerimeter() + ", its area is " + calculateArea() + ".";
        } else {
            return "It's not a figure!";
        }
    }

}
