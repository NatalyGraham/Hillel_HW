import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {

        //right triangle with equal legs
        /*Point point1 = new Point(1, 1);
        Point point2 = new Point(3, 3);
        Point point3 = new Point(1, 3);//*/

        //equilateral triangle;
        /*Point point1 = new Point(0, 0);
        Point point2 = new Point(5, 8.6602540378443865);
        Point point3 = new Point(10, 0);//*/

        //equilateral triangle;
        /*Point point1 = new Point(1, 1);
        Point point2 = new Point(6, 9.66025404);
        Point point3 = new Point(11, 1);//*/

        //isosceles triangle;
        /*Point point1 = new Point(1, 1);
        Point point2 = new Point(6, 8);
        Point point3 = new Point(11, 1);//*/

        //not a triangle
        /*Point point1 = new Point(1, 1);
        Point point2 = new Point(2, 2);
        Point point3 = new Point(3, 3);//*/

        //other triangle
        /*Point point1 = new Point(1, 7);
        Point point2 = new Point(4, -2);
        Point point3 = new Point(-9, 22);//*/



        Triangle triangle = new Triangle(new Point(1, 1), new Point(3, 3), new Point(1, 3));
        //Triangle triangle = new Triangle(new Point(1, 1), new Point(2, 2), new Point(3, 3));
        //System.out.println(triangle);
        /*int tt = triangle.defineTriangleType();
        double area = triangle.calculateArea();
        triangle.printReport(tt, area);//*/


        Triangle triangle1 = new Triangle(new Point(2, 2), new Point(5, 5), new Point(2, 5));
        //Triangle triangle1 = new Triangle(new Point(-5, -5), new Point(-4, -4), new Point(0, 0));
        //System.out.println(triangle1);
        /*int tt1 = triangle1.defineTriangleType();
        double area1 = triangle1.calculateArea();
        triangle1.printReport(tt1, area1);//*/

        Triangle triangle2 = new Triangle(new Point(4, 2), new Point(5, 7), new Point(-2, 5));
        Triangle triangle3 = new Triangle(new Point(1, 1), new Point(6, 9.66025404), new Point(11, 1));
        Triangle triangle4 = new Triangle(new Point(2, 2), new Point(5, 10), new Point(2, 10));

        Processor processor = new Processor(new Triangle[]{triangle, triangle1, triangle2, triangle3, triangle4});
        //processor.chooseTriangleType("right with equal legs");
        //System.out.println(processor.chooseTriangleType("right with equal legs"));
        String[] types = {triangle.getStringTriangleType(), triangle1.getStringTriangleType(), triangle2.getStringTriangleType(), triangle3.getStringTriangleType(), triangle4.getStringTriangleType()};
        System.out.println(Arrays.toString(types));

        System.out.println("Type 1: " + Arrays.toString(processor.chooseTriangleType("equilateral")));
        System.out.println("Type 2: " + Arrays.toString(processor.chooseTriangleType("isosceles")));
        System.out.println("Type 3: " + Arrays.toString(processor.chooseTriangleType("right")));
        System.out.println("Type 4: " + Arrays.toString(processor.chooseTriangleType("right with equal legs")));
        System.out.println("Type 5: " + Arrays.toString(processor.chooseTriangleType("arbitrary")));
        System.out.println("Type 0: " + Arrays.toString(processor.chooseTriangleType("isosceles")));


        //Triangle tmp = processor.getTriangles()[1];
        //System.out.println(tmp);



        //triangle.printLength();


        /*Triangle t1 = new Triangle(new Point(1, 1), new Point(3, 3), new Point(1, 3));
        Triangle t2 = new Triangle(new Point(2, 2), new Point(4, 4), new Point(2, 4));
        Triangle t3 = new Triangle(point1, point2, point3);
        Triangle t4 = new Triangle(point1, point2, point3);
        Triangle t5 = new Triangle(point1, point2, point3);
        Triangle t6 = new Triangle(point1, point2, point3);
        Triangle t7 = new Triangle(point1, point2, point3);
        Triangle t8 = new Triangle(new double[]{1, 1}, new double[]{2,2}, new double[]{3,3});
//*/

    }
}
