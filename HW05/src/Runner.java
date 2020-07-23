public class Runner {

    public static void main(String[] args) {

        Car[] cars = {new Car("id123", "Mersedes", "S500", 2017, "white", 78999.99, "AX0000XA"),
                new Car("id124", "Niva", "X97X", 1997, "red", 1999.99, "AX1524XA"),
                new Car("id125", "Niva", "X09X", 2009, "blue", 2999.99, "AX1732XA"),
                new Car("id127", "Mersedes", "GLK", 1985, "black", 7999.99, "AX7777XA")};

        CarProcessor processor = new CarProcessor();
        processor.carBrandSearcher(cars, "Niva");
        processor.carBrandAgeSearcher(cars, "Niva", 32);
        processor.carOldCostSearcher(cars, 2017, 25000);

    }

}
