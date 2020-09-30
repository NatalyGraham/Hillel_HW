package ua.hillel.javaElementary.hw16.taxiStreamAPI.engine;

import ua.hillel.javaElementary.hw16.taxiStreamAPI.model.Vehicle;

import java.util.ArrayList;

public interface TaxPark {

    ArrayList<Vehicle> speedCars(int minSpeed, int maxSpeed);

    double calculateTotalCost();

    void sortCars();

    String toString(ArrayList<Vehicle> speedCars);

}
