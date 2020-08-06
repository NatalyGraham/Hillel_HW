import java.util.Arrays;

public class Processor {

    private Triangle[] triangles;
    

    Processor(Triangle[] tri) {
        this.triangles = tri;
    }

    public Triangle[] getTriangles() {
        return triangles;
    }

    public Triangle[] chooseTriangleType(String type) {
        Triangle[] typedTriangles = new Triangle[0];
        //Triangle [] typedTriangles = new Triangle[5];

        //int intType = convertTypeToInt(type);
        //TODO: temp var?
        for (Triangle triangle : triangles) {
            int j = 0;


            /*if (intType == 2 || intType ==3){
                if (triangle.getTriangleType() == 4){
                    typedTriangles = modifyArray(typedTriangles, triangle);
                    j++;
                }else if (triangle.getTriangleType() == intType) {
                    typedTriangles = modifyArray(typedTriangles, triangle);
                    j++;
                }
            }else if (intType == 1 || intType == 4 || intType == 5) {
                typedTriangles = modifyArray(typedTriangles, triangle);
                j++;
            }//*/

            if (type.equals("isosceles") || type.equals("right")){
                if (triangle.getStringTriangleType().equals("right with equal legs")){
                    typedTriangles = modifyArray(typedTriangles, triangle);
                    j++;
                }else if (triangle.getStringTriangleType().equals(type)) {
                    typedTriangles = modifyArray(typedTriangles, triangle);
                    j++;
                }
            }else if (type.equals("equilateral") || type.equals("right with equal legs") || type.equals("arbitrary")) {
                if (triangle.getStringTriangleType().equals(type)){
                    typedTriangles = modifyArray(typedTriangles, triangle);
                    j++;
                }

            }else {
                System.out.println("there are no triangles in the array");
            }
        }
        return typedTriangles;
    }

    /*private int convertTypeToInt (String type){
        int intType;
        switch (type){
            case ("not a triangle"): intType = 0;
            case ("equilateral"): intType = 1;
            case ("isosceles"): intType = 2;
            case ("right"): intType = 3;
            case ("right with equal legs"): intType = 4;
            case ("arbitrary"): intType = 5;
            default: intType = -1;
        }

        return intType;
    }//*/

    private Triangle[] modifyArray(Triangle[] initial, Triangle added) {

        Triangle[] modified = new Triangle[initial.length + 1];
        for (int i = 0; i < initial.length; i++) {
            modified[i] = initial[i];
        }
        modified[initial.length] = added;
        return modified;
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
