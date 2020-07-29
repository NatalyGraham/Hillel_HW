abstract class Vehicle {

    private double fuelConsumption;
    private int velocity;
    private double cost;
    private String brand;

    Vehicle (String brand, int velocity, int cost, double fuelConsumption) {
        this.brand = brand;
        this.velocity = velocity;
        this.cost = cost;
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String toString() {
        return "Brand " + brand + ", max velocity" + velocity + ", cost " + cost + ", fuel consumption " + fuelConsumption + ".\\n";
    }

}
