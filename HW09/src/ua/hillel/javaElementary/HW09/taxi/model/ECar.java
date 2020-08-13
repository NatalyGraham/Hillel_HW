package ua.hillel.javaElementary.HW09.taxi.model;

public class ECar extends Sedan {

    private int timeFullCharge;

    public ECar(String brand, String model, int velocity, int cost, double fuelConsumption, int passengers, int timeFullCharge) {
        super(brand, model, velocity, cost, fuelConsumption, passengers);
        this.timeFullCharge = timeFullCharge;
    }

    @Override
    public String toString() {
        return super.toString() + ", time for charging " + timeFullCharge + " [h]";
    }

}
