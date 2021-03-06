public class Pickup extends Truck {

    private int clearance;

    Pickup(String brand, String model, int velocity, int cost, double fuelConsumption, int capacity, int clearance) {
        super(brand, model, velocity, cost, fuelConsumption, capacity);
        this.clearance = clearance;
    }

    @Override
    public String toString() {
        return super.toString() + ", clearance " + clearance + " [mm]";
    }

}
