package ua.hillel.javaElementary.hw12.models;

public class ECar extends Sedan {

    private int timeFullCharge;

    public ECar(String type, String brand, String model, int velocity, int cost, double fuelConsumption, int passengers, int timeFullCharge) {
        super(type, brand, model, velocity, cost, fuelConsumption, passengers);
        this.timeFullCharge = timeFullCharge;
    }

    @Override
    public String toString() {
        return super.toString() + ", time for charging " + timeFullCharge + " [h]";
    }

}
