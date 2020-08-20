package ua.hillel.javaElementary.hw10.flowershop.processor;

import ua.hillel.javaElementary.hw10.flowershop.classes.Accessory;
import ua.hillel.javaElementary.hw10.flowershop.classes.Bouquet;
import ua.hillel.javaElementary.hw10.flowershop.classes.Flower;
import ua.hillel.javaElementary.hw10.flowershop.classes.FlowerShop;
import ua.hillel.javaElementary.hw10.flowershop.exceptions.NegativeLengthException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ConsoleProcessor {

    private BufferedReader reader;
    private FlowerShop flowerShop;

    public ConsoleProcessor(FlowerShop flowerShop) {
        this.flowerShop = flowerShop;
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public void start() throws IOException {
        int choice = 0;
        boolean exit = false;

        do {
            System.out.println("Flower Shop Main Menu:");
            System.out.println("1. Create bouquet");
            System.out.println("2. Bouquets operations");
            System.out.println("3. Show bouquets");
            System.out.println("0. Exit");

            try {
                choice = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException nfe) {
                System.out.println("you should input a number!");
                choice = Integer.parseInt(reader.readLine());
            }

            switch (choice) {
                case (1): {
                    createBouquet();
                    break;
                }
                case (2): {
                    printBouquets();
                    operateBouquets();
                    break;
                }
                case (3): {
                    printBouquets();
                    break;
                }
                case (0): {
                    exit = true;
                    break;
                }
            }

        } while (!exit);

    }

    private void operateBouquets() throws IOException {

        int choice = 0;
        boolean exit = false;
        Bouquet handleBouquet = new Bouquet();

        do {

            System.out.println("Choose the bouquet to handle");
            System.out.println("0. Exit");

            choice = Integer.parseInt(reader.readLine());
            if (choice != 0) {
                try {
                    handleBouquet = flowerShop.getBouquets()[choice - 1];
                } catch (ArrayIndexOutOfBoundsException outOfBoundsException) {
                    System.out.println("You can't choose unreal bouquet. Please, create it!");
                }

                operateMenu(handleBouquet);
                printBouquets();
            }
            if (choice == 0) {
                exit = true;
            }

        } while (!exit);

    }

    private void createBouquet() throws IOException {

        int choice = 0;
        boolean exit = false;
        Bouquet newBouquet = new Bouquet();

        do {
            System.out.println("Creation Menu:");
            System.out.println("1. Create flower");
            System.out.println("2. Create accessory");
            System.out.println("0. Exit");

            try {
                choice = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException nfe) {
                System.out.println("you should input a number!");
                return;
            }

            switch (choice) {
                case (1): {
                    Flower newFlower = createFlower();
                    newBouquet.addFlower(newFlower);
                    break;
                }
                case (2): {
                    Accessory newAccessory = createAccessory();
                    newBouquet.addAccessory(newAccessory);
                    break;
                }
                case (0): {
                    flowerShop.addBouquets(newBouquet);
                    exit = true;
                    break;
                }

            }

        } while (!exit);

    }

    private Flower createFlower() throws IOException {

        String name;
        double cost;
        int stemLength;
        int age;


        System.out.println("Flower Name:");
        name = reader.readLine();

        System.out.println("Flower cost, $:");
        try {
            cost = Double.parseDouble(reader.readLine());
        } catch (NumberFormatException nfe) {
            System.out.println("you should input a number!");
            cost = Double.parseDouble(reader.readLine());
        }

        System.out.println("Flower stem Length, mm:");
        try {
            stemLength = Integer.parseInt(reader.readLine());
            isIntNegative(stemLength);
        } catch (NumberFormatException nfe) {
            System.out.println("you should input a number!");
            stemLength = Integer.parseInt(reader.readLine());
        } catch (NegativeLengthException nle) {
            System.out.println("you should input a positive number!");
            stemLength = Integer.parseInt(reader.readLine());
        }

        System.out.println("Flower age, days");
        try {
            age = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException nfe) {
            System.out.println("you should input a number!");
            age = Integer.parseInt(reader.readLine());
        }

        return new Flower(name, cost, stemLength, age);

    }

    private Accessory createAccessory() throws IOException {

        String name;
        double cost;

        System.out.println("Accessory Name:");
        name = reader.readLine();

        System.out.println("Accessory cost, $:");
        try {
            cost = Double.parseDouble(reader.readLine());
        } catch (NumberFormatException nfe) {
            System.out.println("you should input a number!");
            cost = Double.parseDouble(reader.readLine());
        }

        return new Accessory(name, cost);
    }


    private void operateMenu(Bouquet handleBouquet) throws IOException {

        int choice = 0;
        boolean exit = false;


        do {
            System.out.println("Operation Menu:");
            System.out.println("1. Add Flower");
            System.out.println("2. Add Accessory");
            System.out.println("3. Sort Flowers by its Fresh");
            System.out.println("4. Choose Flowers by Stem Length");
            System.out.println("0. Exit");

            try {
                choice = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException nfe) {
                System.out.println("you should input a number!");
                return;
            }

            switch (choice) {
                case (1): {
                    Flower newFlower = createFlower();
                    handleBouquet.addFlower(newFlower);
                    break;
                }
                case (2): {
                    Accessory newAccessory = createAccessory();
                    handleBouquet.addAccessory(newAccessory);
                    break;
                }
                case (3): {
                    System.out.println(flowerShop.sortFlowersByFresh(handleBouquet));
                    break;
                }
                case (4): {
                    chooseByLengthMenu(handleBouquet);
                    break;
                }

                case (0): {
                    exit = true;
                    break;
                }

            }

        } while (!exit);
    }

    private void chooseByLengthMenu(Bouquet handleBouquet) throws IOException {

        int minLength;
        int maxLength;

        System.out.println("Input min length");
        try {
            minLength = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException nfe) {
            System.out.println("you should input a number!");
            minLength = Integer.parseInt(reader.readLine());
        }

        System.out.println("Input max length");
        try {
            maxLength = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException nfe) {
            System.out.println("you should input a number!");
            maxLength = Integer.parseInt(reader.readLine());
        }

        flowerShop.printChosenFlowersByStemLength(handleBouquet, minLength, maxLength);

    }

    private void printBouquets() {
        System.out.println(flowerShop.printBouquets());
    }

    private boolean isIntNegative(int number) throws NegativeLengthException {
        if (number <= 0) {
            throw new NegativeLengthException();
        } else {
            return false;
        }
    }

    public void stop() throws IOException {
        reader.close();

    }

}
