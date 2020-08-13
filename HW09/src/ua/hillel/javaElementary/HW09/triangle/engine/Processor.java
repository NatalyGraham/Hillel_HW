package ua.hillel.javaElementary.HW09.triangle.engine;


import ua.hillel.javaElementary.HW09.triangle.model.Triangle;
import ua.hillel.javaElementary.HW09.triangle.utils.Criteria;
import ua.hillel.javaElementary.HW09.triangle.utils.Function;

public class Processor {


    private Triangle[] triangles;


    public Processor(Triangle[] tri) {
        this.triangles = tri;
    }

    public int countEquilateral() {
        return countTrianglesByType(Triangle::isEquilateral);
    }

    public int countIsosceles(){
        return countTrianglesByType(Triangle::isIsosceles);
    }

    public int countRight(){
        return countTrianglesByType(Triangle::isRight);
    }

    public int countArbitrary(){
        return countTrianglesByType(Triangle::isArbitrary);
    }

    public Triangle choseMaxArea(Criteria<Triangle> type){
        return choseByMaxCriteria(Triangle::calculateArea,type);
    }

    public Triangle choseMinArea(Criteria<Triangle> type){
        return choseByMinCriteria(Triangle::calculateArea,type);
    }

    public Triangle choseMaxPerimeter(Criteria<Triangle> type){
        return choseByMaxCriteria(Triangle::calculatePerimeter,type);
    }

    public Triangle choseMinPerimeter(Criteria<Triangle> type){
        return choseByMinCriteria(Triangle::calculatePerimeter,type);
    }



    private int countTrianglesByType(Criteria<Triangle> type) {
        int i = 0;

        for (Triangle triangle : triangles) {
            if (type.test(triangle)) {

                i++;
            }
        }
        return i;
    }

    private Triangle choseByMaxCriteria (Function<Triangle, Double> triProp, Criteria<Triangle> type){
        Triangle choosenMax = null;

        for (Triangle triangle:triangles) {
            if(type.test(triangle)){
                choosenMax = triangle;
                if(triProp.apply(choosenMax) > triProp.apply(triangle)){
                    choosenMax = triangle;
                }
            }

        }
        return choosenMax;
    }

    //TODO:показывает последнего!!!
    private Triangle choseByMinCriteria (Function<Triangle, Double> triProp, Criteria<Triangle> type){
        Triangle choosenMin = null;

        for (Triangle triangle:triangles) {
            if(type.test(triangle)){
                choosenMin = triangle;
                if(triProp.apply(choosenMin) < triProp.apply(triangle)){
                    choosenMin = triangle;
                }
            }

        }
        return choosenMin;
    }

    public Triangle[] getTriangles() {
        return triangles;
    }
}
