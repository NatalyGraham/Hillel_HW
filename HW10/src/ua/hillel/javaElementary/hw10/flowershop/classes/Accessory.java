package ua.hillel.javaElementary.hw10.flowershop.classes;

public class Accessory {

    private String name;
    private double cost;

    public Accessory(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public String toString() {
        return "Accessory " + name + " [cost: " + cost + "] ";
    }
}
