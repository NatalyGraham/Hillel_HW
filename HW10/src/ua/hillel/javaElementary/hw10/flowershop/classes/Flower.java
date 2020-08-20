package ua.hillel.javaElementary.hw10.flowershop.classes;

public class Flower {

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

    public double getCost() {
        return cost;
    }

    public double getStem() {
        return stem;
    }

    public int getLifetime() {
        return lifetime;
    }

    public String toString() {
        return "Flower " + name + " [cost: " + cost + ", stem length: " + stem + ", lifetime: " + lifetime + "] ";
    }

}
