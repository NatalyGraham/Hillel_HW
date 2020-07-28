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


    public String toString() {
        String cardata;
        cardata = "Brand " + brand + ", max velocity" + velocity + ", cost " + cost + ", fuel consumption " + fuelConsumption + ".\\n";
        return cardata;
    }

}
