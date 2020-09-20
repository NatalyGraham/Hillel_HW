package ua.hillel.javaElementary.hw15.taxi.engine.impl;

import ua.hillel.javaElementary.hw15.taxi.comparator.impl.FuelConsumptionComparator;
import ua.hillel.javaElementary.hw15.taxi.engine.TaxPark;
import ua.hillel.javaElementary.hw15.taxi.model.Vehicle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


public class TaxParkTaximo implements TaxPark {

    private ArrayList<Vehicle> carsList;

    public TaxParkTaximo(Vehicle... countedCars) {
        carsList = new ArrayList<>();
        for (Vehicle car : countedCars) {
            carsList.add(car);
        }
    }

    public ArrayList<Vehicle> speedCars(int minSpeed, int maxSpeed) {

        ArrayList<Vehicle> modifiedList = new ArrayList<>();
        for (Vehicle car : carsList) {
            if (car.getVelocity() >= minSpeed & car.getVelocity() <= maxSpeed) {
                modifiedList.add(car);
            }
        }
        return modifiedList;

    }

    public double calculateTotalCost() {

        double totalCost = 0;
        for (Vehicle car : carsList) {
            totalCost += car.getCost();
        }
        return totalCost;

    }

    public void sortCarsMethodLink() {
        FuelConsumptionComparator<Vehicle> consumptionComparator = new FuelConsumptionComparator<>();
        carsList.sort(consumptionComparator::compare);
    }

    public void sortCars() {
        carsList.sort(new Comparator<>() {
            @Override
            public int compare(Vehicle o1, Vehicle o2) {
                return (int) ((o1.getFuelConsumption() - o2.getFuelConsumption()) * 100);
            }
        });
    }
    public void sortCarsLambda() {
        carsList.sort((o1, o2) -> (int) ((o1.getFuelConsumption() - o2.getFuelConsumption()) * 100));
    }

    public String toString(ArrayList<Vehicle> speedCars) {

        String report = "";
        for (Vehicle car : speedCars) {
            report += car.toString() + "\n";
        }
        return report;

    }

    public ArrayList<Vehicle> getCars() {
        return carsList;
    }
}
