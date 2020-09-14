package ua.hillel.javaElementary.HW14.model;

public abstract class Vehicle {

    private double fuelConsumption;
    private int velocity;
    private double cost;
    private String brand;
    private String model;

    Vehicle(String brand, String model, int velocity, int cost, double fuelConsumption) {
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
        return "Car " + brand + " " + model + ", velocity " + velocity + " [km/h], cost " + cost + " [$], fuel consumption " +
                fuelConsumption + " [l/100km]";
    }

}
