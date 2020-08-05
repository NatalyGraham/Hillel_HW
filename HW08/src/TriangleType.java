public class TriangleType {

/*    private String isosceles;
    private String equilateral;
    private String right;
    private String otherType;

    TriangleType(Triangle t) {
        if (isEquilateralTriangle(t)) {
            equilateral = "Equilateral";
        } else if (isIsoscelesTriangle(t)) {
            isosceles = "Isosceles";
        } else if (isRightTriangle(t)) {
            right = "Right";
        } else {
            otherType = "Other";
        }
    }

    public boolean isEquilateralTriangle(Triangle triangle) {

        if (triangle.getLength12().getLength() == triangle.getLength13().getLength() &
                triangle.getLength23().getLength() == triangle.getLength12().getLength()) {
            return true;
        } else return false;

    }

    public boolean isIsoscelesTriangle(Triangle triangle) {

        if (isEquilateralTriangle(triangle)) {
            return false;
        } else if (triangle.getLength12().getLength() == triangle.getLength13().getLength() ||
                triangle.getLength23().getLength() == triangle.getLength12().getLength() ||
                triangle.getLength23().getLength() == triangle.getLength13().getLength()) {
            return true;
        } else return false;

    }

    public boolean isRightTriangle(Triangle triangle) {

        if (triangle.getLength12().getSqrLength() == (triangle.getLength13().getSqrLength() + triangle.getLength23().getSqrLength()) ||
                triangle.getLength13().getSqrLength() == (triangle.getLength12().getSqrLength() + triangle.getLength23().getSqrLength()) ||
                triangle.getLength23().getSqrLength() == (triangle.getLength12().getSqrLength() + triangle.getLength13().getSqrLength())) {
            return true;
        } else return false;

    }

    public String[] getType(){
        String [] types;
        if(equilateral!=null){

        }
        return types;
    }

    public String getIsosceles() {
        return isosceles;
    }

    public void setIsosceles(String isosceles) {
        this.isosceles = isosceles;
    }

    public String getEquilateral() {
        return equilateral;
    }

    public void setEquilateral(String equilateral) {
        this.equilateral = equilateral;
    }

    public String getRight() {
        return right;
    }

    public void setRight(String right) {
        this.right = right;
    }

    public String getOtherType() {
        return otherType;
    }

    public void setOtherType(String otherType) {
        this.otherType = otherType;
    }

    //*/
}
