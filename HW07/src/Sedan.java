public class Sedan extends Vehicle {

    private int maxPassengers;

    Sedan(String brand, int velocity, int cost, double fuelConsumption, int maxPassengers) {
        super(brand, velocity, cost, fuelConsumption);
        this.maxPassengers = maxPassengers;
    }

    @Override
    public String toString() {
        return "Sedan " +"Brand " + getBrand() + ", max velocity " + getVelocity() + " [km/h], cost " + getCost() +
                " [$], fuel consumption " + getFuelConsumption() + " [l/100km], passengers "  + maxPassengers;
    }

}
