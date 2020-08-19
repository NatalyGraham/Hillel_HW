package ua.hillel.javaElementary.hw10.flowershop.processor;

import ua.hillel.javaElementary.hw10.flowershop.classes.FlowerShop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleProcessor_3 {

    private Scanner scanner;
    private FlowerShop flowerShop;

    public ConsoleProcessor_3(FlowerShop flowerShop) {
        this.flowerShop = flowerShop;
        scanner = new Scanner(System.in);
    }

    /*public ConsoleProcessor_3 start(ConsoleProcessor_3 cp3){

        int choice;


        System.out.println("Flower Shop Main Menu:");
        System.out.println("1. Create bouquet");
        System.out.println("2. Bouquets operations");
        System.out.println("3. Show bouquets");
        System.out.println("0. Exit");

        do{
            choice = scanner.nextInt();

            switch (choice) {
                case (1) : {
                   return new  createBouquet();
                }
                case (2): {
                    return operateBouquets();

                }
                case (3): {
                    return printBouquets();

                }                

                case (0): {
                    return;
                }
                default:return;

            }

        }while (choice != 0);

    }//*/

    /*private void operateBouquets(){

        int choice = 0;
        System.out.println("operate bouquets");

        do{
            choice = scanner.nextInt();

            switch (choice){
            case (1):{
                System.out.println("fhjk"); break;}

            case (0): {
                    //stop();
                    return;
                }

            }

        }while (choice != 0);

    }//*/

    /*private void createBouquet(){

        int choice;

        System.out.println("Creation Menu:");
        System.out.println("1. Create flower");
        System.out.println("2. Create accessory");
        System.out.println("0. Exit");

        do{
            choice = scanner.nextInt();

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
                    start();
                }

                default:
                    return;
            }

        }while (choice != 0);

    }//*/

    private void createFlower(){

        int choice = 0;

        System.out.println("Flower Creation Menu:");
        System.out.println("1. Add new flower");
        System.out.println("-1. Exit");

        do{
            choice = scanner.nextInt();

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

    /*private void createAccessory(){

        int choice = 0;

        System.out.println("Flower Creation Menu:");
        System.out.println("1. Add new flower");
        System.out.println("-1. Exit");

        do{
            choice = scanner.nextInt();

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
    }//*/

    private void printBouquets() {
    }

    public void stop(){

        scanner.close();

    }

}
