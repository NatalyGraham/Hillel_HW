public class Runner {

    public static void main(String[] args) {

        //right triangle with equal legs
        Point point1 = new Point(1, 1);
        Point point2 = new Point(3, 3);
        Point point3 = new Point(1, 3);//*/

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



        Triangle triangle = new Triangle(point1, point2, point3);
        triangle.printReport();

        //triangle.printLength();


        Triangle t1 = new Triangle(point1, point2, point3);
        Triangle t2 = new Triangle(point1, point2, point3);
        Triangle t3 = new Triangle(point1, point2, point3);
        Triangle t4 = new Triangle(point1, point2, point3);
        Triangle t5 = new Triangle(point1, point2, point3);
        Triangle t6 = new Triangle(point1, point2, point3);
        Triangle t7 = new Triangle(point1, point2, point3);
        Triangle t8 = new Triangle(new double[]{1, 1}, new double[]{2,2}, new double[]{3,3});


    }
}
