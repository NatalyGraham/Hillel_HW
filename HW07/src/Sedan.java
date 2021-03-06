public class Sedan extends Vehicle {

    private int maxPassengers;

    Sedan(String brand, String model, int velocity, int cost, double fuelConsumption, int maxPassengers) {
        super(brand, model, velocity, cost, fuelConsumption);
        this.maxPassengers = maxPassengers;
    }

    @Override
    public String toString() {
        return super.toString() + ", passengers " + maxPassengers;
    }

}
