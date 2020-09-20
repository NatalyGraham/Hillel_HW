package ua.hillel.javaElementary.hw15.taxi.engine;

import ua.hillel.javaElementary.hw15.taxi.model.Vehicle;

import java.util.ArrayList;

public interface TaxPark {

    ArrayList<Vehicle> speedCars(int minSpeed, int maxSpeed);

    double calculateTotalCost();

    void sortCars();

    void sortCarsMethodLink();

    void sortCarsLambda();

    String toString(ArrayList<Vehicle> speedCars);

}
