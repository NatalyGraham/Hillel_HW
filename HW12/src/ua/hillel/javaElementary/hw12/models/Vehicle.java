package ua.hillel.javaElementary.hw12.models;

abstract public class Vehicle {

    private double fuelConsumption;
    private int velocity;
    private double cost;
    private String brand;
    private String type;
    private String model;

    Vehicle(String type, String  brand, String model, int velocity, int cost, double fuelConsumption) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.velocity = velocity;
        this.cost = cost;
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public int getVelocity() {
        return velocity;
    }

    public double getCost() {
        return cost;
    }

    public String toString() {
        return type + "," + brand + "," + model + "," + velocity + "," + cost + "," + fuelConsumption;
    }

}
