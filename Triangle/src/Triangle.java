public class Triangle {

    Point point1;
    Point point2;
    Point point3;
    double sqrLength12;
    double sqrLength23;
    double sqrLength13;

    Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public double calculateLength(Point p1, Point p2) {
        int sqrLength;
        sqrLength = (int) (Math.pow(Math.abs(p1.getCoordinateX() - p2.getCoordinateX()), 2) +
                Math.pow(Math.abs(p1.getCoordinateY() - p2.getCoordinateY()), 2));
        return sqrLength;
    }

    public boolean isTriangle() {
        sqrLength12 = calculateLength(point1, point2);
        sqrLength23 = calculateLength(point2, point3);
        sqrLength13 = calculateLength(point1, point3);

        if ((Math.sqrt(sqrLength12) + Math.sqrt(sqrLength23)) > Math.sqrt(sqrLength13) &&
                (Math.sqrt(sqrLength13) + Math.sqrt(sqrLength23)) > Math.sqrt(sqrLength12) &&
                (Math.sqrt(sqrLength12) + Math.sqrt(sqrLength13)) > Math.sqrt(sqrLength23)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEquilateralTriangle() {
        if (isTriangle()) {
            if (sqrLength12 == sqrLength13 & sqrLength23 == sqrLength12) {
                return true;
            } else return false;
        } else {
            return false;
        }
    }

    public boolean isIsoscelesTriangle() {
        if (isTriangle()) {
            if (isEquilateralTriangle()) {
                return false;
            } else if (sqrLength12 == sqrLength13 || sqrLength23 == sqrLength12 || sqrLength23 == sqrLength13) {
                return true;
            } else return false;
        } else {
            return false;
        }
    }

    public boolean isRightTriangle() {
        if (isTriangle()) {
            if (sqrLength12 == (sqrLength13 + sqrLength23) ||
                    sqrLength13 == (sqrLength12 + sqrLength23) ||
                    sqrLength23 == (sqrLength12 + sqrLength13)) {
                return true;
            } else return false;
        } else {
            return false;
        }
    }

    public double calculatePerimeter() {
        if (isTriangle()) {
            return  (Math.sqrt(sqrLength12) + Math.sqrt(sqrLength23) + Math.sqrt(sqrLength13));
        }
        return 0;
    }

    public double calculateArea() {
        if (isTriangle()) {
                double halfPerimeter = calculatePerimeter()/2;
                return  Math.sqrt(halfPerimeter*(halfPerimeter-Math.sqrt(sqrLength12))*(halfPerimeter-Math.sqrt(sqrLength23))*(halfPerimeter-Math.sqrt(sqrLength13)));
        }
        return 0;
    }

    public void printReport() {
        if (isTriangle()) {
            if (isEquilateralTriangle()) {
                System.out.println("It's an equilateral triangle");
                System.out.println("Its perimeter is: " + calculatePerimeter());
                System.out.println("Its area is: " + calculateArea());
            } else if (isIsoscelesTriangle()) {
                if (isRightTriangle()) {
                    System.out.println("It's a right triangle with equal legs");
                    System.out.println("Its perimeter is: " + calculatePerimeter());
                    System.out.println("Its area is: " + calculateArea());
                } else {
                    System.out.println("It's an isosceles triangle");
                    System.out.println("Its perimeter is: " + calculatePerimeter());
                    System.out.println("Its area is: " + calculateArea());
                }
            } else if (isRightTriangle()) {
                System.out.println("It's a right triangle");
                System.out.println("Its perimeter is: " + calculatePerimeter());
                System.out.println("Its area is: " + calculateArea());
            }
        } else {
            System.out.println("It's not a triangle");
        }
    }

    /*public void printLength() {
        sqrLength12 = calculateLength(point1, point2);
        sqrLength23 = calculateLength(point2, point3);
        sqrLength13 = calculateLength(point1, point3);
        System.out.println(sqrLength12);
        System.out.println(sqrLength23);
        System.out.println(sqrLength13);
        System.out.println(isRightTriangle());


    }//*/
}
