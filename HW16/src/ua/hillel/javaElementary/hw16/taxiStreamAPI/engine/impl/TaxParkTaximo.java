package ua.hillel.javaElementary.hw16.taxiStreamAPI.engine.impl;

import ua.hillel.javaElementary.hw16.taxiStreamAPI.engine.TaxPark;
import ua.hillel.javaElementary.hw16.taxiStreamAPI.model.Vehicle;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;


public class TaxParkTaximo implements TaxPark {

    private ArrayList<Vehicle> carsList;

    public TaxParkTaximo(Vehicle... countedCars) {
        carsList = new ArrayList<>();
        for (Vehicle car : countedCars) {
            carsList.add(car);
        }
    }

    public ArrayList<Vehicle> speedCars(int minSpeed, int maxSpeed) {

        return (ArrayList<Vehicle>) carsList.stream()
                .filter(x -> minSpeed < x.getVelocity() && x.getVelocity() < maxSpeed).collect(Collectors.toList());

    }

    public double calculateTotalCost() {

        return carsList.stream().mapToDouble(Vehicle::getCost).reduce(0, Double::sum);

    }

    public void sortCars() {

        carsList = (ArrayList<Vehicle>) carsList.stream().sorted(Comparator.comparingDouble(Vehicle::getFuelConsumption))
                .collect(Collectors.toList());

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
