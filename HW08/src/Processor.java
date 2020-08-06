
public class Processor {

    private double minPerimeter;
    private double maxPerimeter;
    private double minArea;
    private double maxArea;
    private int quantityEquilateral = 0;
    private int quantityRight = 0;
    private int quantityIsosceles = 0;
    private int quantityArbitrary = 0;

    private Triangle choosenMinPerimeter;
    private Triangle choosenMaxPerimeter;
    private Triangle choosenMinArea;
    private Triangle choosenMaxArea;

    private Triangle[] triangles;


    Processor(Triangle[] tri) {
        this.triangles = tri;
    }

    public Triangle[] chooseTriangleType(String type) {
        Triangle[] typedTriangles = new Triangle[0];

        for (Triangle triangle : triangles) {

            if (type.equals("isosceles") || type.equals("right")) {
                if (triangle.getTriangleType().equals("right with equal legs")) {
                    typedTriangles = modifyArray(typedTriangles, triangle);
                } else if (triangle.getTriangleType().equals(type)) {
                    typedTriangles = modifyArray(typedTriangles, triangle);
                }
            } else if (type.equals("equilateral") || type.equals("right with equal legs") || type.equals("arbitrary")) {
                if (triangle.getTriangleType().equals(type)) {
                    typedTriangles = modifyArray(typedTriangles, triangle);
                }
            }

        }

        return typedTriangles;
    }

    private Triangle[] modifyArray(Triangle[] initial, Triangle added) {

        Triangle[] modified = new Triangle[initial.length + 1];
        for (int i = 0; i < initial.length; i++) {
            modified[i] = initial[i];
        }
        modified[initial.length] = added;
        return modified;
    }

    private void chooseMaxMinTriangleParameters(Triangle[] tri){
        choosenMinPerimeter = tri[0];
        choosenMaxPerimeter = tri[0];
        choosenMinArea = tri[0];
        choosenMaxArea = tri[0];

        maxPerimeter = tri[0].getPerimeter();
        minPerimeter = tri[0].getPerimeter();
        maxPerimeter = tri[0].getArea();
        minPerimeter = tri[0].getArea();

        for (Triangle tmpTriangle: tri) {
            if (tmpTriangle.getPerimeter() > maxPerimeter) {
                maxPerimeter = tmpTriangle.getPerimeter();
                choosenMaxPerimeter = tmpTriangle;
            }
            if (tmpTriangle.getPerimeter() < minPerimeter) {
                minPerimeter = tmpTriangle.getPerimeter();
                choosenMinPerimeter = tmpTriangle;
            }if (tmpTriangle.getArea() > maxArea) {
                maxArea = tmpTriangle.getArea();
                choosenMaxArea = tmpTriangle;
            }
            if (tmpTriangle.getArea() < minArea) {
                minArea = tmpTriangle.getArea();
                choosenMinArea = tmpTriangle;
            }
        }
    }

    private void calculateQuantityDiffTriangles(){
        for (Triangle tmpTri: triangles) {

            switch (tmpTri.getTriangleType()){
                case ("equilateral"): quantityEquilateral++; break;
                case ("isosceles"): quantityIsosceles++; break;
                case ("right"): quantityRight++; break;
                case ("arbitrary"): quantityArbitrary++; break;
                case ("right with equal legs"): quantityRight++; quantityIsosceles++; break;
                default:
                    break;
            }

        }
    }

    public void showQuantityTrianglesType() {
        calculateQuantityDiffTriangles();
        System.out.println("Quantity of different triangle types:");
        System.out.println("Equilateral: " + quantityEquilateral);
        System.out.println("Isosceles: " + quantityIsosceles);
        System.out.println("Right: " + quantityRight);
        System.out.println("Arbitrary: " + quantityArbitrary);
        System.out.println();
    }

    public Triangle getMaxArea (String type){
        chooseMaxMinTriangleParameters(chooseTriangleType(type));
        return choosenMaxArea;
    }

    public Triangle getMinArea (String type){
        chooseMaxMinTriangleParameters(chooseTriangleType(type));
        return choosenMinArea;
    }

    public Triangle getMaxPerimeter (String type){
        chooseMaxMinTriangleParameters(chooseTriangleType(type));
        return choosenMaxPerimeter;
    }

    public Triangle getMinPerimeter (String type){
        chooseMaxMinTriangleParameters(chooseTriangleType(type));
        return choosenMinPerimeter;
    }

}
