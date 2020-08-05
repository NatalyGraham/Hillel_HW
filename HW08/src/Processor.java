import java.util.Arrays;

public class Processor {

    private Triangle[] triangles;
    Triangle[] typedTriangles;

    Processor(Triangle[] tri) {
        this.triangles = tri;
    }

    public Triangle[] getTriangles() {
        return triangles;
    }

    public Triangle[] chooseTriangleType(String type) {
        int j = 0;
        //Triangle [] typedTriangles = new Triangle[5];

        //TODO: temp var?
        for (Triangle triangle : triangles) {

            if (triangle.getStringTriangleType().equals(type)) {
                typedTriangles[j] = triangle;
                j++;
            }
        }
        return typedTriangles;
    }


    public void setTrianglesArray(Triangle... t) {
        System.arraycopy(t, 0, triangles, 0, t.length);
    }

    /*public Triangle[] chooseTriangleType(String type){
        Triangle[] typedTriangles;

        for (int i = 0; i < triangles.length; i++) {
            TriangleType tt = new TriangleType(triangles[i]);
            if(tt.)
        }



        return typedTriangles;
    }//*/

    @Override
    public String toString() {
        return "Processor{" +
                "triangles=" + Arrays.toString(triangles) +
                '}';
    }
}
