package ua.hillel.javaElementary.HW14.model;

public class Sedan extends Vehicle {

    private int maxPassengers;

    public Sedan(String brand, String model, int velocity, int cost, double fuelConsumption, int maxPassengers) {
        super(brand, model, velocity, cost, fuelConsumption);
        this.maxPassengers = maxPassengers;
    }

    @Override
    public String toString() {
        return super.toString() + ", passengers " + maxPassengers;
    }

}
