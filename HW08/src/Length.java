public class Length {

    private double sqrLength;
    private double length;

    Length(Point p1, Point p2) {
        sqrLength = (Math.pow(Math.abs(p1.getCoordinateX() - p2.getCoordinateX()), 2) +
                Math.pow(Math.abs(p1.getCoordinateY() - p2.getCoordinateY()), 2));
        length = Math.sqrt(sqrLength);
    }

    public double getSqrLength() {
        return sqrLength;
    }

    public double getLength() {
        return length;
    }

}
