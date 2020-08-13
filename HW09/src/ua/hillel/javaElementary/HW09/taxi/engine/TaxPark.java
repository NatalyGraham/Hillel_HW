package ua.hillel.javaElementary.HW09.taxi.engine;

import ua.hillel.javaElementary.HW09.taxi.model.Vehicle;

public interface TaxPark {

    Vehicle[] speedCars(int minSpeed, int maxSpeed);

    double calculateTotalCost();

    Vehicle[] sortCars();

    String toString(Vehicle[] speedCars);

}
