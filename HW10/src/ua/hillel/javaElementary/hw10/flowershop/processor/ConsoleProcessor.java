package ua.hillel.javaElementary.hw10.flowershop.processor;

import ua.hillel.javaElementary.hw10.flowershop.classes.Flower;
import ua.hillel.javaElementary.hw10.flowershop.classes.FlowerShop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

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
        System.out.println("operate bouquets");

        do {
            choice = Integer.parseInt(reader.readLine());

            switch (choice) {
                case (1): {
                    System.out.println("fhjk");
                    break;
                }

                case (0): {
                    //stop();
                    return;
                }

            }

        } while (choice != 0);

    }

    private void createBouquet() throws IOException {

        int choice = 0;
        boolean exit = false;

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
                    createFlower();
                    break;
                }
                case (2): {
                    createAccessory();
                    break;
                }
                case (0): {
                    exit = true;

                    break;
                }

            }

        } while (!exit);

    }

    private void createFlower() throws IOException {



        String name;
        double cost;
        int stemLength;
        int age;



        System.out.println("Flower Name:");
        name = reader.readLine();

        System.out.println("Flower cost, $:");
        cost = Double.parseDouble(reader.readLine());

        System.out.println("Flower stem Length, mm:");
        stemLength = Integer.parseInt(reader.readLine());

        System.out.println("Flower age, days");
        age = Integer.parseInt(reader.readLine());

        flowerShop.addFlowerToBouquete(new Flower(name, cost, stemLength, age));


    }

    private void createAccessory() throws IOException {

        int choice = 0;

        System.out.println("Flower Creation Menu:");
        System.out.println("1. Add new flower");
        System.out.println("-1. Exit");

        do {
            choice = Integer.parseInt(reader.readLine());

            switch (choice) {
                case (1): {
                    break;
                }
                case (-1): {
                    start();
                    return;
                }
            }
        } while (choice != -1);
    }

    private void printBouquets() {
        System.out.println(flowerShop.printFlowers());
    }

    public void stop() throws IOException {

        reader.close();

    }

}
