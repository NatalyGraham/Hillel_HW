public class Truck extends Vehicle {

    private int capacity;

    Truck(String brand, int velocity, int cost, double fuelConsumption, int capacity) {
        super(brand, velocity, cost, fuelConsumption);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Truck " + "Brand " + getBrand() + ", max velocity " + getVelocity() + " [km/h], cost " + getCost() +
                " [$] , fuel consumption " + getFuelConsumption() + " [l/100km], capacity " + capacity + " [m^3].";
    }

}
