package ua.hillel.javaElementary.hw12.processor;

import ua.hillel.javaElementary.hw12.models.Vehicle;

public class TaxPark {

    private Vehicle[] cars;

    public TaxPark(Vehicle... countedCars) {
        cars = countedCars;
    }

    public Vehicle[] speedCars(int minSpeed, int maxSpeed) {

        Vehicle[] modifiedArray = new Vehicle[0];
        for (Vehicle car : cars) {
            if (car.getVelocity() >= minSpeed & car.getVelocity() <= maxSpeed) {
                modifiedArray = modifyArray(modifiedArray, car);
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

    public Vehicle[] sortCars() {

        Vehicle[] sortedCars = cars;
        for (int i = 0; i < sortedCars.length; i++) {
            double minConsumption = sortedCars[i].getFuelConsumption();
            Vehicle minConsumptionCar = sortedCars[i];
            int minId = i;
            for (int j = i + 1; j < sortedCars.length; j++) {
                if (sortedCars[j].getFuelConsumption() < minConsumption) {
                    minConsumptionCar = sortedCars[j];
                    minId = j;
                }
            }
            Vehicle temp = sortedCars[i];
            sortedCars[i] = minConsumptionCar;
            sortedCars[minId] = temp;
        }
        return sortedCars;

    }

    private Vehicle[] modifyArray(Vehicle[] initial, Vehicle added) {

        Vehicle[] modified = new Vehicle[initial.length + 1];
        for (int i = 0; i < initial.length; i++) {
            modified[i] = initial[i];
        }
        modified[initial.length] = added;
        return modified;

    }

    public String makeReport(Vehicle[] cars) {

        String report = "";
        for (Vehicle car : cars) {
            report += car.toString() + ";\r\n";
        }
        return report;

    }

}
