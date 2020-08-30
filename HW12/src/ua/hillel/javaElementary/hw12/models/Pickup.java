package ua.hillel.javaElementary.hw12.models;

public class Pickup extends Truck {

    private int clearance;

    public Pickup(String  type, String brand, String model, int velocity, int cost, double fuelConsumption, int capacity, int clearance) {
        super(type, brand, model, velocity, cost, fuelConsumption, capacity);
        this.clearance = clearance;
    }

    @Override
    public String toString() {
        return super.toString() + ", clearance " + clearance + " [mm]";
    }

}
