public class Runner {

    public static void main(String[] args) {

        Point point1 = new Point(1, 1);
        Point point2 = new Point(3, 3);
        Point point3 = new Point(1, 3);

        Triangle triangle = new Triangle(point1, point2, point3);
        //triangle.printReport();

        triangle.printLength();

    }
}
