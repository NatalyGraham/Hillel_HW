package ua.hillel.javaElementary.HW09.triangle.app;

import ua.hillel.javaElementary.HW09.triangle.engine.Processor;
import ua.hillel.javaElementary.HW09.triangle.model.Point;
import ua.hillel.javaElementary.HW09.triangle.model.Triangle;

public class Runner {

    public static void main(String[] args) {

        Triangle triangle1 = new Triangle(new Point(1, 1), new Point(3, 3), new Point(1, 3));
        Triangle triangle2 = new Triangle(new Point(2, 2), new Point(5, 2), new Point(5, 6));
        Triangle triangle3 = new Triangle(new Point(-7, 2), new Point(-6, 12), new Point(4, 11));
        Triangle triangle4 = new Triangle(new Point(0, 0), new Point(-6, 0), new Point(0, -5));
        Triangle triangle5 = new Triangle(new Point(6, 1), new Point(6, -5), new Point(7, -2));
        Triangle triangle6 = new Triangle(new Point(0, 0), new Point(5, 8.6602540378443865), new Point(10, 0));
        Triangle triangle7 = new Triangle(new Point(7, 7), new Point(15, 7), new Point(11, 8));
        Triangle triangle8 = new Triangle(new Point(-10, 5), new Point(-10, -3), new Point(1, 3));
        Triangle triangle9 = new Triangle(new Point(1, 1), new Point(11, 18.320508075688773), new Point(21, 1));
        Triangle triangle10 = new Triangle(new Point(5, 6), new Point(4, 11), new Point(7, 7));
        Triangle triangle11 = new Triangle(new Point(-7, 2), new Point(12, 2), new Point(15, 7));
        Triangle triangle12 = new Triangle(new Point(1, 1), new Point(4, -8), new Point(12, 2));
        Triangle triangle13 = new Triangle(new Point(7, 10), new Point(9, 11), new Point(11, 12));

        Triangle[] triangles = new Triangle[]{triangle1, triangle2, triangle3, triangle4, triangle5,
                triangle6, triangle7, triangle8, triangle9, triangle10, triangle11, triangle12, triangle13};


        Processor processor = new Processor(triangles);

        System.out.println("Arbitrary are: " + processor.countArbitrary());
        System.out.println("Right are: " + processor.countRight());
        System.out.println("Isosceles are: " + processor.countIsosceles());
        System.out.println("Equilateral are: " + processor.countEquilateral());
        System.out.println();

        System.out.println("MaxPerimeter Arbitrary " + processor.choseMaxPerimeter(Triangle::isArbitrary));
        System.out.println("MaxArea Isosceles " + processor.choseMaxArea(Triangle::isIsosceles));
        System.out.println("MinArea Equilateral " + processor.choseMinArea(Triangle::isEquilateral));
        System.out.println("MinPerimeter Right " + processor.choseMinPerimeter(Triangle::isRight));
    }
}
