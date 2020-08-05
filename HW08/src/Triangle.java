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
    private int triangleType;
    private String stringTriangleType;
    private Length length12;
    private Length length23;
    private Length length13;


    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    private void initializeTriangle(){
        isFigure(point1,point2, point3);
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

    public String defineType(int type){
        switch (type){
            case (0): return "not a triangle";
            case (1): return "equilateral";
            case (2): return "isosceles";
            case (3): return "right";
            case (4): return "right with equal legs";
            case (5): return "arbitrary";
            default: return "";
        }
        //return stringTriangleType;
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
        /*triangleType = defineTriangleType();
        perimeter = calculatePerimeter();
        area = calculateArea();//*/
        initializeTriangle();
    }

    Triangle(double[] p1, double[] p2, double[] p3) {
        this.point1.setCoordinateX(p1[0]);
        this.point1.setCoordinateY(p1[1]);
        this.point2.setCoordinateX(p2[0]);
        this.point2.setCoordinateY(p2[1]);
        this.point3.setCoordinateX(p3[0]);
        this.point3.setCoordinateY(p3[1]);
        /*triangleType = defineTriangleType();
        perimeter = calculatePerimeter();
        area = calculateArea();//*/
        initializeTriangle();
    }

 /*   public double calculateLength(Point p1, Point p2) {
        int sqrLength;
        sqrLength = (int) (Math.pow(Math.abs(p1.getCoordinateX() - p2.getCoordinateX()), 2) +
                Math.pow(Math.abs(p1.getCoordinateY() - p2.getCoordinateY()), 2));
        return sqrLength;
    }//*/

    public String getStringTriangleType() {
        return stringTriangleType;
    }

    public int getTriangleType() {
        return triangleType;
    }
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

    public void printReport(int tT, double ar) {

        System.out.println("Triangle type is: " + tT);
        System.out.println("Triangle area is: " + ar);

/*        if (isEquilateralTriangle()) {
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
        }//*/
    }

    @Override
    public boolean isFigure(Point... points) {
        length12 = new Length(point1, point2);
        length23 = new Length(point2, point3);
        length13 = new Length(point1, point3);

        /*if ((Math.sqrt(length12.getLength()) + Math.sqrt(length23.getLength())) > Math.sqrt(length13.getLength()) &
                (Math.sqrt(length13.getLength()) + Math.sqrt(length23.getLength())) > Math.sqrt(length12.getLength()) &
                (Math.sqrt(length12.getLength()) + Math.sqrt(length13.getLength())) > Math.sqrt(length23.getLength())) {
            return true;
        }//*/

        /*sqrLength12 = length12.getSqrLength();
        sqrLength23 = length23.getSqrLength();
        sqrLength13 = length13.getSqrLength();

        mlength12 = length12.getLength();
        mlength23 = length23.getLength();
        mlength13 = length13.getLength();//*/

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
    public String toString(){
        if (isFigure()){
            return "Triangle [[" + point1.getCoordinateX() +", " + point1.getCoordinateY() + "], [" + point2.getCoordinateX() +", " + point2.getCoordinateY() + "], [" +
                    point3.getCoordinateX() +", " + point3.getCoordinateY() + "]] is " + stringTriangleType + ". Its perimeter is " + perimeter + ", its area is " + area + ".";
        }else {
            return "Triangle [[" + point1.getCoordinateX() +", " + point1.getCoordinateY() + "], [" + point2.getCoordinateX() +", " + point2.getCoordinateY() + "], [" +
                    point3.getCoordinateX() +", " + point3.getCoordinateY() + "]] is " + stringTriangleType + ".";
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
