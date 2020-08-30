package ua.hillel.javaElementary.hw12.app;

import ua.hillel.javaElementary.hw12.models.*;
import ua.hillel.javaElementary.hw12.processor.TaxPark;
import ua.hillel.javaElementary.hw12.utils.CarMaker;
import ua.hillel.javaElementary.hw12.utils.Reader;

import java.io.File;

public class Runner {

    public static void main(String[] args) {

        String taxis =  Reader.readFile(new File("input.txt"));
        CarMaker newCars = new CarMaker(taxis);
        TaxPark taximo = new TaxPark(newCars.makeCars());
        ;
        //System.out.println(taxis);

        //Truck volvoFH = new Truck("truck","Volvo", "FH", 120, 87000, 36.8, 9);
        //Sedan fiesta = new Sedan("sedan","Ford", "Fiesta", 160, 20000, 6.8, 4);
        //Sedan mustang = new Sedan("sedan","Ford", "Mustang", 280, 80000, 16.5, 1);
        //Pickup tundra = new Pickup("pickup","Toyota", "Tundra", 90, 45000, 20, 1, 300);
        //ECar tesla = new ECar("ecar","Tesla", "Model S", 200, 43200, 0, 4, 2);

        //TaxPark taximo = new TaxPark(volvoFH, fiesta, mustang, tundra, tesla);

        System.out.println("Car's total cost is: " + taximo.calculateTotalCost() + " $.\n");

        int minSpeed = 100;
        int maxSpeed = 180;
        System.out.println("Cars with max speed between " + minSpeed + " km/h and " + maxSpeed + " km/h.");
        System.out.println(taximo.toString(taximo.speedCars(minSpeed, maxSpeed)));

        System.out.println("Sorted cars by increasing of fuel consumption:");
        System.out.println(taximo.toString(taximo.sortCars()));

    }

}
