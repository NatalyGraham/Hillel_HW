public class CarProcessor {

    private Car[] proceedCars;

    public CarProcessor(Car[] cars) {
        proceedCars = cars;
    }

    public CarProcessor() {
        proceedCars = new Car[5];
    }

    private boolean isEmpty(Car[] cars) {
        boolean isEmpty = true;
        for (Car currentCar : cars) {
            if (currentCar != null) {
                isEmpty = false;
                break;
            }
        }
        return isEmpty;
    }

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

    public void carBrandSearcher(String brand) {
        if (isEmpty(proceedCars)) {
            printEmptyCarBase();
        } else {
            int i = 0;
            for (Car currentCar : proceedCars) {
                if (currentCar.brand.equals(brand)) {
                    printCars(currentCar);
                    i++;
                }
            }
            if (i == 0) {
                printNoCars();
            }
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

    public void carBrandAgeSearcher(String brand, int age) {
        if (isEmpty(proceedCars)) {
            printEmptyCarBase();
        } else {
            int i = 0;
            int currentYear = 2020;
            for (Car currentCar : proceedCars) {
                if (currentCar.brand.equals(brand) & (currentYear - currentCar.productionYear) > age) {
                    printCars(currentCar);
                    i++;
                }
            }
            if (i == 0) {
                printNoCars();
            }
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

    public void carOldCostSearcher(int productionYear, double cost) {
        if (isEmpty(proceedCars)) {
            printEmptyCarBase();
        } else {
            int i = 0;
            for (Car currentCar : proceedCars) {
                if (currentCar.productionYear == productionYear & currentCar.cost > cost) {
                    printCars(currentCar);
                    i++;
                }
            }
            if (i == 0) {
                printNoCars();
            }
        }
    }

    public void printCars(Car car) {
        System.out.println(car.id + " " + car.brand + " " + car.model + " " +
                car.productionYear + " " + car.color + " " + car.cost + " " +
                car.registrationNumber);
    }

    public void printNoCars() {
        System.out.println("There are no such cars in the base.");
    }

    public void printEmptyCarBase() {
        System.out.println("Cars base is empty, there are no cars for searching.");
    }

}
