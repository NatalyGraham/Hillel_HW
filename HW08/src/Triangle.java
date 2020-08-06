public class Triangle extends Figure {

    private double sqrLength12;
    private double sqrLength23;
    private double sqrLength13;
    private double absLength12;
    private double absLength23;
    private double absLength13;
    private double area;
    private double perimeter;

    private String triangleName;
    private String triangleType;

    private Length length12;
    private Length length23;
    private Length length13;
    private Point point1;
    private Point point2;
    private Point point3;

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
        absLength12 = length12.getLength();
        absLength23 = length23.getLength();
        absLength13 = length13.getLength();

        triangleType = defineTriangleType();
        perimeter = calculatePerimeter();
        area = calculateArea();
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public String defineTriangleType() {
        if (isFigure(point1, point2, point3)) {
            if (isEquilateralTriangle()) {
                triangleType = "equilateral";
            } else if (isIsoscelesTriangle()) {
                if (isRightTriangle()) {
                    triangleType = "right with equal legs";
                } else {
                    triangleType = "isosceles";
                }
            } else if (isRightTriangle()) {
                triangleType = "right";
            } else {
                triangleType = "arbitrary";
            }
        }
        return triangleType;
    }

    public String getTriangleType() {
        return triangleType;
    }

    public boolean isEquilateralTriangle() {

        if (absLength12 == absLength13 & absLength23 == absLength12 & absLength13 == absLength23) {
            return true;
        } else return false;

    }

    public boolean isIsoscelesTriangle() {

        if (isEquilateralTriangle()) {
            return false;
        } else if (sqrLength12 == sqrLength13 || sqrLength23 == sqrLength12 || sqrLength23 == sqrLength13) {
            return true;
        } else return false;

    }

    public boolean isRightTriangle() {

        if (sqrLength12 == (sqrLength13 + sqrLength23) ||
                sqrLength13 == (sqrLength12 + sqrLength23) ||
                sqrLength23 == (sqrLength12 + sqrLength13)) {
            return true;
        } else return false;

    }

    @Override
    public double calculatePerimeter() {

        perimeter = absLength12 + absLength23 + absLength13;
        return perimeter;
    }

    @Override
    public double calculateArea() {

        double halfPerimeter = calculatePerimeter() / 2;
        area = Math.sqrt(halfPerimeter * (halfPerimeter - absLength12) * (halfPerimeter - absLength23) * (halfPerimeter - absLength13));
        return area;

    }

    public String getTriangleName() {
        return triangleName;
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
            triangleType = "not a triangle";
            return false;
        }
    }

    @Override
    public String toString() {
        if (isFigure()) {
            return "Triangle " + triangleName + " [[" + point1.getCoordinateX() + ", " + point1.getCoordinateY() + "], [" + point2.getCoordinateX() + ", " + point2.getCoordinateY() + "], [" +
                    point3.getCoordinateX() + ", " + point3.getCoordinateY() + "]] is " + triangleType + ". Its perimeter is " + perimeter + ", its area is " + area + ".";
        } else {
            return "Triangle " + triangleName + " [[" + point1.getCoordinateX() + ", " + point1.getCoordinateY() + "], [" + point2.getCoordinateX() + ", " + point2.getCoordinateY() + "], [" +
                    point3.getCoordinateX() + ", " + point3.getCoordinateY() + "]] is " + triangleType + ".";
        }
    }

}
