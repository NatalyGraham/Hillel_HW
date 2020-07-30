
public class Runner {

    public static void main(String[] args) {

        Truck volvoFH = new Truck("Volvo", "FH", 120, 87000, 36.8, 9);
        Sedan fiesta = new Sedan("Ford", "Fiesta", 160, 20000, 6.8, 4);
        Sedan mustang = new Sedan("Ford", "Mustang", 280, 80000, 16.5, 1);
        Pickup tundra = new Pickup("Toyota", "Tundra", 90, 45000, 20, 1, 300);
        ECar tesla = new ECar("Tesla", "Model S", 200, 43200, 0, 4, 2);

        TaxPark taximo = new TaxPark(volvoFH, fiesta, mustang, tundra, tesla);

        System.out.println("Car's total cost is: " + taximo.calculateTotalCost() + " $.\n");

        int minSpeed = 100;
        int maxSpeed = 180;
        System.out.println("Cars with max speed between " + minSpeed + " km/h and " + maxSpeed + " km/h.");
        System.out.println(taximo.toString(taximo.speedCars(minSpeed, maxSpeed)));

        System.out.println("Sorted cars by increasing of fuel consumption:");
        System.out.println(taximo.toString(taximo.sortCars()));

    }

}
