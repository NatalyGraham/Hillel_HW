public class ECar extends Sedan{

    private int timeFullCharge;

    ECar(String brand, int velocity, int cost, double fuelConsumption, int passengers, int timeFullCharge) {
        super(brand, velocity, cost, fuelConsumption, passengers);
        this.timeFullCharge = timeFullCharge;
    }

    @Override
    public String toString() {
        return "Electric Car " +"Brand " + getBrand() + ", max velocity " + getVelocity() + " km/h, cost " + getCost() +
                " $, fuel consumption " + getFuelConsumption() + " l/100km, time for charging "  + timeFullCharge + " h.";
    }
}
