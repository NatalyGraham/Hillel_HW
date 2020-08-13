package ua.hillel.javaElementary.HW09.taxi.model;

public class Truck extends Vehicle {

    private int capacity;

    public Truck(String brand, String model, int velocity, int cost, double fuelConsumption, int capacity) {
        super(brand, model, velocity, cost, fuelConsumption);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", capacity " + capacity + " [m^3]";
    }

}
