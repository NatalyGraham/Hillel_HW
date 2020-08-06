
public class Runner {

    public static void main(String[] args) {

        Triangle triangle1 = new Triangle("#1", new Point(1, 1), new Point(3, 3), new Point(1, 3));
        Triangle triangle2 = new Triangle("#2", new Point(2, 2), new Point(5, 2), new Point(5, 6));
        Triangle triangle3 = new Triangle("#3", new Point(-7, 2), new Point(-6, 12), new Point(4, 11));
        Triangle triangle4 = new Triangle("#4", new Point(0, 0), new Point(-6, 0), new Point(0, -5));
        Triangle triangle5 = new Triangle("#5", new Point(6, 1), new Point(6, -5), new Point(7, -2));
        Triangle triangle6 = new Triangle("#6", new Point(0, 0), new Point(5, 8.6602540378443865), new Point(10, 0));
        Triangle triangle7 = new Triangle("#7", new Point(7, 7), new Point(15, 7), new Point(11, 8));
        Triangle triangle8 = new Triangle("#8", new Point(-10, 5), new Point(-10, -3), new Point(1, 3));
        Triangle triangle9 = new Triangle("#9", new Point(1, 1), new Point(11, 18.320508075688773), new Point(21, 1));
        Triangle triangle10 = new Triangle("#10", new Point(5, 6), new Point(4, 11), new Point(7, 7));
        Triangle triangle11 = new Triangle("#11", new Point(-7, 2), new Point(12, 2), new Point(15, 7));
        Triangle triangle12 = new Triangle("#12", new Point(1, 1), new Point(4, -8), new Point(12, 2));
        Triangle triangle13 = new Triangle("#13", new double[]{7,10}, new double[]{9,11},  new double[]{11,12});

        Triangle[] triangles = new Triangle[]{triangle1, triangle2, triangle3, triangle4, triangle5,
                triangle6, triangle7, triangle8, triangle9, triangle10, triangle11, triangle12, triangle13};

        Processor processor = new Processor(triangles);
        processor.showQuantityTrianglesType();

        //TYPES:    "not a triangle"
        //          "equilateral"
        //          "isosceles"
        //          "right"
        //          "right with equal legs"
        //          "arbitrary"

        String triangleType = "arbitrary";
        System.out.println(triangleType + " triangle with maximum area is " + processor.getMaxArea(triangleType));
        System.out.println(triangleType + " triangle with minimum area is " + processor.getMinArea(triangleType));
        System.out.println(triangleType + " triangle with maximum perimeter is " + processor.getMaxPerimeter(triangleType));
        System.out.println(triangleType + " triangle with minimum perimeter is " + processor.getMinPerimeter(triangleType));


    }
}
