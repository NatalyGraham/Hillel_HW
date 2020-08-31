package ua.hillel.javaElementary.hw12.models;

public class Sedan extends Vehicle {

    private int maxPassengers;

    public Sedan(String type, String brand, String model, int velocity, int cost, double fuelConsumption, int maxPassengers) {
        super(type, brand, model, velocity, cost, fuelConsumption);
        this.maxPassengers = maxPassengers;
    }

    @Override
    public String toString() {
        return super.toString() + "," + maxPassengers;
    }

}
