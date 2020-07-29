public class Runner {

    public static void main(String[] args) {

        Truck volvo = new Truck("Volvo", 120, 87000, 36.8, 9);
        Sedan fiesta = new Sedan("Ford", 160, 20000, 6.8, 4);
        Sedan mustang = new Sedan("Ford", 280, 80000, 16.5, 1);
        Pickup tundra = new Pickup("Toyota", 90, 45000, 20, 1, 300);
        ECar tesla = new ECar("Tesla", 200, 43200, 0, 4, 2);

        TaxPark taximo = new TaxPark(volvo, fiesta, mustang, tundra, tesla);
        System.out.println("Car's total cost is: " + taximo.calculateTotalCost() + " $");
        System.out.println(volvo.toString());
        System.out.println(tesla.toString());

    }
}
