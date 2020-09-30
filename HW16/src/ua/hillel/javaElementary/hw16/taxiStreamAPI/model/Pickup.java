package ua.hillel.javaElementary.hw16.taxiStreamAPI.model;

public class Pickup extends Truck {

    private int clearance;

    public Pickup(String brand, String model, int velocity, int cost, double fuelConsumption, int capacity, int clearance) {
        super(brand, model, velocity, cost, fuelConsumption, capacity);
        this.clearance = clearance;
    }

    @Override
    public String toString() {
        return super.toString() + ", clearance " + clearance + " [mm]";
    }

}
