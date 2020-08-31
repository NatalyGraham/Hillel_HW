package ua.hillel.javaElementary.hw12.models;

public class Truck extends Vehicle {

    private int capacity;

    public Truck(String type, String brand, String model, int velocity, int cost, double fuelConsumption, int capacity) {
        super(type, brand, model, velocity, cost, fuelConsumption);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return super.toString() + "," + capacity;
    }

}
