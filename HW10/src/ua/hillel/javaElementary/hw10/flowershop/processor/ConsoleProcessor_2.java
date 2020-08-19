package ua.hillel.javaElementary.hw10.flowershop.processor;

import ua.hillel.javaElementary.hw10.flowershop.classes.FlowerShop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleProcessor_2 {

    private BufferedReader reader;
    private FlowerShop flowerShop;

    public ConsoleProcessor_2(FlowerShop flowerShop) {
        this.flowerShop = flowerShop;
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public void start() throws IOException {

        int choice = 0;


        System.out.println("Flower Shop Main Menu:");
        System.out.println("1. Create bouquet");
        System.out.println("2. Bouquets operations");
        System.out.println("3. Show bouquets");
        System.out.println("0. Exit");

        while (choice != 0){
            choice = Integer.parseInt(reader.readLine());

            switch (choice) {
                case (1) : {
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
                    return;
                }

            }

        }

    }

    private void operateBouquets() throws IOException {

        int choice = 0;
        System.out.println("operate bouquets");

        do{
            choice = Integer.parseInt(reader.readLine());

            switch (choice){
            case (1):{
                System.out.println("fhjk"); break;}

            case (0): {
                    //stop();
                    return;
                }

            }

        }while (choice != 0);

    }

    private void createBouquet() throws IOException {

        int choice = -1;

        System.out.println("Creation Menu:");
        System.out.println("1. Create flower");
        System.out.println("2. Create accessory");
        System.out.println("0. Exit");

        while (choice != 0){
            choice = Integer.parseInt(reader.readLine());

            switch (choice) {
                case (1) : {
                    createFlower();
                    break;
                }
                case (2): {
                    createAccessory();
                    break;
                }
                case (0): {
                    stop();
                    start();
                    return;
                }

            }

        }

    }

    private void createFlower() throws IOException {

        int choice = 0;

        System.out.println("Flower Creation Menu:");
        System.out.println("1. Add new flower");
        System.out.println("-1. Exit");

        do{
            choice = Integer.parseInt(reader.readLine());

            switch (choice) {
                case (1) : {
                    break;
                }
                case (-1): {
                    return;
                }
            }
        }while (choice != -1);
    }

    private void createAccessory() throws IOException {

        int choice = 0;

        System.out.println("Flower Creation Menu:");
        System.out.println("1. Add new flower");
        System.out.println("-1. Exit");

        do{
            choice = Integer.parseInt(reader.readLine());

            switch (choice) {
                case (1) : {
                    break;
                }
                case (-1): {
                    start();
                    return;
                }
            }
        }while (choice != -1);
    }

    private void printBouquets() {
    }

    public void stop() throws IOException {

        reader.close();

    }

}
