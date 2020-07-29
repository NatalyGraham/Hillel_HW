public class Pickup extends Truck{

    private int clearance;

    Pickup(String brand, int velocity, int cost, double fuelConsumption, int capacity, int clearance) {
        super(brand, velocity, cost, fuelConsumption, capacity);
        this.clearance = clearance;
    }

    @Override
    public String toString() {
        return "Pick-Up " +"Brand " + getBrand() + ", max velocity " + getVelocity() + " km/h, cost " + getCost() +
                " $, fuel consumption " + getFuelConsumption() + " l/100km, clearance "  + clearance + " mm.";
    }
}
