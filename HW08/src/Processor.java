import javax.sound.midi.Soundbank;

public class Processor {

    private double minPerimeter;
    private double maxPerimeter;
    private double minArea;
    private double maxArea;

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
                if (triangle.getStringTriangleType().equals("right with equal legs")) {
                    typedTriangles = modifyArray(typedTriangles, triangle);
                } else if (triangle.getStringTriangleType().equals(type)) {
                    typedTriangles = modifyArray(typedTriangles, triangle);
                }
            } else if (type.equals("equilateral") || type.equals("right with equal legs") || type.equals("arbitrary")) {
                if (triangle.getStringTriangleType().equals(type)) {
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

    public void showTrianglesType() {
        System.out.println("Triangle types are: ");
        for (Triangle tmpTri: triangles) {
            System.out.print(tmpTri.getTriangleName() + " : ");
            System.out.println(tmpTri.getStringTriangleType());
        }
    }

}
