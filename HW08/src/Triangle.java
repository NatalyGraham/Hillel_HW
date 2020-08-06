public class Triangle extends Figure {

    private Point point1;
    private Point point2;
    private Point point3;
    private double sqrLength12;
    private double sqrLength23;
    private double sqrLength13;
    private double mlength12;
    private double mlength23;
    private double mlength13;
    private double area;
    private double perimeter;
    private int triangleType; //TODO: change int to String
    private String triangleName;
    private String stringTriangleType;
    private Length length12;
    private Length length23;
    private Length length13;

    Triangle(String name, Point point1, Point point2, Point point3) {
        this.triangleName = name;
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        initializeTriangle();
    }

    Triangle(String name, double[] p1, double[] p2, double[] p3) {
        this.triangleName = name;
        this.point1 = new Point(p1[0], p1[1]);
        this.point2 = new Point(p2[0], p2[1]);
        this.point3 = new Point(p3[0], p3[1]);
        initializeTriangle();
    }

    private void initializeTriangle() {
        isFigure(point1, point2, point3);
        sqrLength12 = length12.getSqrLength();
        sqrLength23 = length23.getSqrLength();
        sqrLength13 = length13.getSqrLength();
        mlength12 = length12.getLength();
        mlength23 = length23.getLength();
        mlength13 = length13.getLength();

        triangleType = defineTriangleType();
        stringTriangleType = defineType(triangleType);
        perimeter = calculatePerimeter();
        area = calculateArea();
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public String defineType(int type) {
        switch (type) {
            case (0):
                return "not a triangle";
            case (1):
                return "equilateral";
            case (2):
                return "isosceles";
            case (3):
                return "right";
            case (4):
                return "right with equal legs";
            case (5):
                return "arbitrary";
            default:
                return "";
        }
    }

    public int defineTriangleType() {
        if (isFigure(point1, point2, point3)) {
            if (isEquilateralTriangle()) {
                triangleType = 1;
                //stringTriangleType = "equilateral";
            } else if (isIsoscelesTriangle()) {
                if (isRightTriangle()) {
                    triangleType = 4;
                    //stringTriangleType = "right with equal legs";
                } else {
                    triangleType = 2;
                    //stringTriangleType = "isosceles";
                }
            } else if (isRightTriangle()) {
                triangleType = 3;
                //stringTriangleType = "right";
            } else {
                triangleType = 5;
                //stringTriangleType = "arbitrary";
            }
        } //else {
        //triangleType = 0;
        //}
        return triangleType;
    }

    public String getStringTriangleType() {
        return stringTriangleType;
    }

    public boolean isEquilateralTriangle() {
        //       if (isFigure(point1,point2,point3)) {
        if (mlength12 == mlength13 & mlength23 == mlength12 & mlength13 == mlength23) {
            return true;
        } else return false;
        //} else {
//            return false;
        //       }
    }

    public boolean isIsoscelesTriangle() {
        //if (isTriangle()) {
        if (isEquilateralTriangle()) {
            return false;
        } else if (sqrLength12 == sqrLength13 || sqrLength23 == sqrLength12 || sqrLength23 == sqrLength13) {
            return true;
        } else return false;
        //} else {
        //    return false;
        //}
    }

    public boolean isRightTriangle() {
        //if (isTriangle()) {
        if (sqrLength12 == (sqrLength13 + sqrLength23) ||
                sqrLength13 == (sqrLength12 + sqrLength23) ||
                sqrLength23 == (sqrLength12 + sqrLength13)) {
            return true;
        } else return false;
        //} else {
        //    return false;
        //}
    }

    public String getTriangleName() {
        return triangleName;
    }

    public double calculatePerimeter() {

        //if (isTriangle()) {
        perimeter = mlength12 + mlength23 + mlength13;
        return perimeter;
        //}
        //return 0;
    }

    public double calculateArea() {
        //if (isTriangle()) {
        double halfPerimeter = calculatePerimeter() / 2;
        area = Math.sqrt(halfPerimeter * (halfPerimeter - mlength12) * (halfPerimeter - mlength23) * (halfPerimeter - mlength13));
        return area;
        // }
        //return 0;
    }

    @Override
    public boolean isFigure(Point... points) {
        length12 = new Length(point1, point2);
        length23 = new Length(point2, point3);
        length13 = new Length(point1, point3);

        if ((length12.getLength() + length23.getLength()) > length13.getLength() &
                (length13.getLength() + length23.getLength()) > length12.getLength() &
                (length12.getLength() + length13.getLength()) > length23.getLength()) {
            return true;
        } else {
            triangleType = 0;
            stringTriangleType = defineType(triangleType);
            return false;
        }
    }

    @Override
    public String toString() {
        if (isFigure()) {
            return "Triangle " + triangleName + " [[" + point1.getCoordinateX() + ", " + point1.getCoordinateY() + "], [" + point2.getCoordinateX() + ", " + point2.getCoordinateY() + "], [" +
                    point3.getCoordinateX() + ", " + point3.getCoordinateY() + "]] is " + stringTriangleType + ". Its perimeter is " + perimeter + ", its area is " + area + ".";
        } else {
            return "Triangle " + triangleName + " [[" + point1.getCoordinateX() + ", " + point1.getCoordinateY() + "], [" + point2.getCoordinateX() + ", " + point2.getCoordinateY() + "], [" +
                    point3.getCoordinateX() + ", " + point3.getCoordinateY() + "]] is " + stringTriangleType + ".";
        }
    }

}
