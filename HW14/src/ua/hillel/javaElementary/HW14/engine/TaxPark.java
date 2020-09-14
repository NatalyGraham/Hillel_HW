package ua.hillel.javaElementary.HW14.engine;

import ua.hillel.javaElementary.HW14.model.Vehicle;

public interface TaxPark {

    Vehicle[] speedCars(int minSpeed, int maxSpeed);

    double calculateTotalCost();

    void sortCars();

    void sortCarsMethodLink();

    void sortCarsLambda();

    String toString(Vehicle[] speedCars);

}
