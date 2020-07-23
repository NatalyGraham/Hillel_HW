public class CarProcessor {

    public void carBrandSearcher(Car[] cars, String brand) {

        int i = 0;
        for (Car currentCar : cars) {
            if (currentCar.brand.equals(brand)) {
                printCars(currentCar);
                i++;
            }
        }
        if (i == 0) {
            printNoCars();
        }

    }

    public void carBrandAgeSearcher(Car[] cars, String brand, int age) {

        int i = 0;
        int currentYear = 2020;
        for (Car currentCar : cars) {
            if (currentCar.brand.equals(brand) & (currentYear - currentCar.productionYear) > age) {
                printCars(currentCar);
                i++;
            }
        }
        if (i == 0) {
            printNoCars();
        }

    }

    public void carOldCostSearcher(Car[] cars, int productionYear, double cost) {

        int i = 0;
        for (Car currentCar : cars) {
            if (currentCar.productionYear == productionYear & currentCar.cost > cost) {
                printCars(currentCar);
                i++;
            }
        }
        if (i == 0) {
            printNoCars();
        }

    }

    public void printCars(Car car) {

        System.out.println( car.id + " " + car.brand + " " + car.model + " " +
                            car.productionYear + " " + car.color + " " + car.cost + " " +
                            car.registrationNumber);
    }

    public void printNoCars() {
        System.out.println("There are no such cars in the base.");
    }

}
