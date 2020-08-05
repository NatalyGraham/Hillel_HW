public class Processor {

    private Triangle[] triangles;
    private Triangle[] typedTriangles;

    Processor(Triangle... tri){
        System.arraycopy(tri, 0, triangles, 0, tri.length);
    }

    private void chooseTriangleType(String type){
        int j = 0;
        //Triangle minPerimeter;
        //Triangle maxPerimeter;
        //Triangle minArea;
        //Triangle maxArea;

        //TODO: temp var?
        for (int i = 0; i > triangles.length; i++){
            /*Triangle minPerimeter = typedTriangles[0];
            Triangle maxPerimeter = typedTriangles[0];
            Triangle minArea = typedTriangles[0];
            Triangle maxArea = typedTriangles[0];
            double minPer = typedTriangles[0].getPerimeter();
            double maxPer = typedTriangles[0].getPerimeter();
            double minAr = typedTriangles[0].getArea();
            double maxAr = typedTriangles[0].getArea();//*/

            if (triangles[i].getStringTriangleType().equals(type)){
                typedTriangles[j] = triangles[i];
                Triangle minPerimeter = typedTriangles[j];
                Triangle maxPerimeter = typedTriangles[j];
                Triangle minArea = typedTriangles[j];
                Triangle maxArea = typedTriangles[j];
                double minPer = typedTriangles[j].getPerimeter();
                double maxPer = typedTriangles[j].getPerimeter();
                double minAr = typedTriangles[j].getArea();
                double maxAr = typedTriangles[j].getArea();
                j++;
            }
        }
    }



    public void setTrianglesArray (Triangle... t){
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

}
