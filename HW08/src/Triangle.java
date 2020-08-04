public class Triangle extends Figure {

    Point point1;
    Point point2;
    Point point3;
    double sqrLength12;
    double sqrLength23;
    double sqrLength13;
    private Length length12;
    private Length length23;
    private Length length13;

    public Length getLength12() {
        return length12;
    }

    public void setLength12(Length length12) {
        this.length12 = length12;
    }

    public Length getLength23() {
        return length23;
    }

    public void setLength23(Length length23) {
        this.length23 = length23;
    }

    public Length getLength13() {
        return length13;
    }

    public void setLength13(Length length13) {
        this.length13 = length13;
    }

    Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    Triangle(double[] p1, double[] p2, double[] p3 ){
        this.point1.setCoordinateX(p1[0]);
        this.point1.setCoordinateY(p1[1]);
        this.point2.setCoordinateX(p2[0]);
        this.point2.setCoordinateY(p2[1]);
        this.point3.setCoordinateX(p3[0]);
        this.point3.setCoordinateY(p3[1]);
    }

 /*   public double calculateLength(Point p1, Point p2) {
        int sqrLength;
        sqrLength = (int) (Math.pow(Math.abs(p1.getCoordinateX() - p2.getCoordinateX()), 2) +
                Math.pow(Math.abs(p1.getCoordinateY() - p2.getCoordinateY()), 2));
        return sqrLength;
    }//*/

/*    public boolean isTriangle() {
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
    }//*/

    public boolean isEquilateralTriangle() {
 //       if (isFigure(point1,point2,point3)) {
            if (sqrLength12 == sqrLength13 & sqrLength23 == sqrLength12) {
                return true;
            } else return false;
        //} else {
//            return false;
 //       }
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
            return (Math.sqrt(sqrLength12) + Math.sqrt(sqrLength23) + Math.sqrt(sqrLength13));
        }
        return 0;
    }

    public double calculateArea() {
        if (isTriangle()) {
            double halfPerimeter = calculatePerimeter() / 2;
            return Math.sqrt(halfPerimeter * (halfPerimeter - Math.sqrt(sqrLength12)) * (halfPerimeter - Math.sqrt(sqrLength23)) * (halfPerimeter - Math.sqrt(sqrLength13)));
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

    @Override
    public boolean isFigure(Point... points) {
        length12 = new Length(point1, point2);
        length23 = new Length(point2, point3);
        length13 = new Length(point1, point3);

        if ((Math.sqrt(length12.getLength()) + Math.sqrt(length23.getLength())) > Math.sqrt(length13.getLength()) &&
                (Math.sqrt(length13.getLength()) + Math.sqrt(length23.getLength())) > Math.sqrt(length12.getLength()) &&
                (Math.sqrt(length12.getLength()) + Math.sqrt(length13.getLength())) > Math.sqrt(length23.getLength())) {
            return true;
        } else {
            return false;
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
