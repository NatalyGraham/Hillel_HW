public class Processor {

    Triangle[] triangles;

    public void setTrianglesArray (Triangle... t){
        System.arraycopy(t, 0, triangles, 0, t.length);
    }

    public Triangle[] chooseTriangleType(String type){
        Triangle[] typedTriangles;

        for (int i = 0; i < triangles.length; i++) {
            TriangleType tt = new TriangleType(triangles[i]);
            if(tt.)
        }



        return typedTriangles;
    }

}
