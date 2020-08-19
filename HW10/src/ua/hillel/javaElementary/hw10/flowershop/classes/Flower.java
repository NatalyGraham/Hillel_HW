package ua.hillel.javaElementary.hw10.flowershop.classes;

public class Flower{

    private String name;
    private double cost;
    private int stem;
    private int lifetime;


    public Flower(String name, double cost, int stem, int lifetime) {
        this.name = name;
        this.cost = cost;
        this.stem = stem;
        this.lifetime = lifetime;
    }

    /*public String getType() {
        return type;
    }//*/

    /*public void setType(String type) {
        this.type = type;
    }//*/

    /*public String getName() {
        return name;
    }//*/

    /*public void setName(String name) {
        this.name = name;
    }//*/

    public double getCost() {
        return cost;
    }//*/

    /*public void setCost(double cost) {
        this.cost = cost;
    }//*/

    public double getStem() {
        return stem;
    }

    public void setStem(int stem) {
        this.stem = stem;
    }

    public int getLifetime() {
        return lifetime;
    }

    public void setLifetime(int lifetime) {
        this.lifetime = lifetime;
    }


    public String toString() {
        return "Flower " + name + " [ cost: " + cost + ", stem length: " + stem + ", lifetime: " + lifetime + "] ";
    }
}
