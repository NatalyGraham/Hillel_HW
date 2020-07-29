public class TaxPark {
    private Vehicle[] cars;
    private Vehicle[] cars2;

    TaxPark(Vehicle... countedCars) {
        cars = countedCars;
    }

    /*public Vehicle[] speedCars(int minSpeed, int maxSpeed) {
        int k = 0;
        Vehicle[] carsArray = new Vehicle[0];
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getVelocity() >= minSpeed & cars[i].getVelocity() <= maxSpeed) {
                k++;
                Vehicle[] modCars = new Vehicle[k];
                modCars = modifyArray(carsArray, cars[i]);
                        modCars[k] = cars[i];
                        return modCars;
            }

        }

        return modCars;
    }//*/

    public double calculateTotalCost() {
        double totalCost = 0;
        for (Vehicle car : cars) {
            totalCost += car.getCost();
        }
        return totalCost;
    }

   /* private Vehicle[] sortCars(Vehicle[] cars) {
        Vehicle[] sortedCars;

        return sortedCars;
    }//*/

    private Vehicle[] modifyArray(Vehicle[] initial, Vehicle added) {
        Vehicle[] modified = new Vehicle[initial.length + 1];
        for (int i = 0; i < initial.length; i++) {
            modified[i] = initial[i];
        }
        modified[initial.length + 1] = added;
        return modified;
    }
}
