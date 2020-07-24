public class Triangle {

    Point point1;
    Point point2;
    Point point3;
    double length12;
    double length23;
    double length13;

    Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public double calculateLength(Point p1, Point p2) {
        double length;
        length = Math.sqrt(Math.pow(Math.abs(p1.getCoordinateX() - p2.getCoordinateX()), 2) + Math.pow(Math.abs(p1.getCoordinateY() - p2.getCoordinateY()), 2));
        return length;
    }

    public boolean isTriangle() {
        length12 = calculateLength(point1, point2);
        length23 = calculateLength(point2, point3);
        length13 = calculateLength(point1, point3);
        if ((length12 + length23) > length13 && (length13 + length23) > length12 && (length12 + length13) > length23) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEquilateralTriangle() {
        if (isTriangle()) {
            if (length12 == length13 & length23 == length12) {
                return true;
            } else return false;
        } else {
            //printIsTriangle();
            return false;
        }
    }

    public boolean isIsoscelesTriangle() {
        if (isTriangle()) {
            if (length12 == length13 | length23 == length12 | length23 == length13) {
                return true;
            } else return false;
        } else {
            //printIsTriangle();
            return false;
        }
    }

    public boolean isRightTriangle() {
        if (isTriangle()) {
            if (Math.pow(length12, 2) == (Math.pow(length13, 2) + Math.pow(length23, 2)) |
                    Math.pow(length13, 2) == (Math.pow(length12, 2) + Math.pow(length23, 2)) |
                    Math.pow(length23, 2) == (Math.pow(length12, 2) + Math.pow(length13, 2))) {
                return true;
            } else return false;
        } else {
            //printIsTriangle();
            return false;
        }
    }


/*    public void printIsTriangle() {

        boolean isTriangle = isTriangle();
        if (isTriangle) {
            System.out.println("It's a triangle");
        } else {
            System.out.println("It's not a triangle");
        }
    }//*/

    public void printReport() {
        if (isTriangle()) {
            if (isEquilateralTriangle()) {
                System.out.println("It's an equilateral triangle");
            } else if (isIsoscelesTriangle()) {
                if (isRightTriangle()) {
                    System.out.println("It's a right triangle with equal legs");
                } else {
                    System.out.println("It's an isosceles triangle");
                }
            } else if (isRightTriangle()) {
                System.out.println("It's a right triangle");
            } else {
                System.out.println("It's not a triangle");
            }
        }
    }

    public void printLength() {
        length12 = calculateLength(point1, point2);
        length23 = calculateLength(point2, point3);
        length13 = calculateLength(point1, point3);
        System.out.println(length12);
        System.out.println(length23);
        System.out.println(length13);
        System.out.println(isRightTriangle());
        System.out.println(Math.pow(length12,2));
        System.out.println(Math.pow(length13, 2));
        System.out.println(Math.pow(length23, 2));
    }
}
