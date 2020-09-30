package ua.hillel.javaElementary.hw16.taxiStreamAPI.app;

import ua.hillel.javaElementary.hw16.taxiStreamAPI.engine.impl.TaxParkTaximo;
import ua.hillel.javaElementary.hw16.taxiStreamAPI.model.ECar;
import ua.hillel.javaElementary.hw16.taxiStreamAPI.model.Pickup;
import ua.hillel.javaElementary.hw16.taxiStreamAPI.model.Sedan;
import ua.hillel.javaElementary.hw16.taxiStreamAPI.model.Truck;

public class Runner {

    public static void main(String[] args) {

        Truck volvoFH = new Truck("Volvo", "FH", 120, 87000, 36.3, 9);
        Sedan fiesta = new Sedan("Ford", "Fiesta", 160, 20000, 6.5, 4);
        Sedan mustang = new Sedan("Ford", "Mustang", 280, 80000, 6.2, 1);
        Pickup tundra = new Pickup("Toyota", "Tundra", 90, 45000, 20.7, 1, 300);
        ECar tesla = new ECar("Tesla", "Model S", 200, 43200, 0, 4, 2);

        TaxParkTaximo eTaximo = new TaxParkTaximo(volvoFH, fiesta, mustang, tundra, tesla);

        System.out.println("Car's total cost is: " + eTaximo.calculateTotalCost() + " $.\n");

        int minSpeed = 100;
        int maxSpeed = 180;
        System.out.println("Cars with max speed between " + minSpeed + " km/h and " + maxSpeed + " km/h.");
        System.out.println(eTaximo.toString(eTaximo.speedCars(minSpeed, maxSpeed)));

        System.out.println("Sorted cars by increasing of fuel consumption:");
        eTaximo.sortCars();
        System.out.println(eTaximo.toString(eTaximo.getCars()));

    }

}
