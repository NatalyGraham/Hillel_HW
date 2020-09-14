package ua.hillel.javaElementary.HW14.engine.impl;

import ua.hillel.javaElementary.HW14.comparator.impl.FuelConsumptionComparator;
import ua.hillel.javaElementary.HW14.engine.TaxPark;
import ua.hillel.javaElementary.HW14.model.Vehicle;
import ua.hillel.javaElementary.HW14.utils.arrayModifier;

import java.util.Arrays;
import java.util.Comparator;


public class TaxParkTaximo implements TaxPark {

    private Vehicle[] cars;

    public TaxParkTaximo(Vehicle... countedCars) {
        cars = countedCars;
    }

    public Vehicle[] speedCars(int minSpeed, int maxSpeed) {

        Vehicle[] modifiedArray = new Vehicle[0];
        for (Vehicle car : cars) {
            if (car.getVelocity() >= minSpeed & car.getVelocity() <= maxSpeed) {
                modifiedArray = arrayModifier.modifyArray(modifiedArray, car);
            }

        }
        return modifiedArray;

    }

    public double calculateTotalCost() {

        double totalCost = 0;
        for (Vehicle car : cars) {
            totalCost += car.getCost();
        }
        return totalCost;

    }

    public void sortCars() {
        Arrays.sort(cars, new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle o1, Vehicle o2) {
                return (int) ((o1.getFuelConsumption() - o2.getFuelConsumption()) * 100);
            }
        });
    }

    public void sortCarsMethodLink() {
        FuelConsumptionComparator<Vehicle> consumptionComparator = new FuelConsumptionComparator<>();
        Arrays.sort(cars, consumptionComparator::compare);
    }

    public void sortCarsLambda() {
        Arrays.sort(cars, (o1, o2) -> (int) ((o1.getFuelConsumption() - o2.getFuelConsumption()) * 100));
    }


    public String toString(Vehicle[] speedCars) {

        String report = "";
        for (Vehicle car : speedCars) {
            report += car.toString() + "\n";
        }
        return report;

    }

    public Vehicle[] getCars() {
        return cars;
    }
}
