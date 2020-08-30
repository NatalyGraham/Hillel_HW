package ua.hillel.javaElementary.hw12.utils;

import ua.hillel.javaElementary.hw12.models.*;

public class CarMaker {
    private String[] cars;
    private String[] carProperties;
    private String inputText;

    public CarMaker(String inputText) {
        this.inputText = inputText;
        this.cars = inputText.split(";\r\n");
    }

    public Vehicle[] makeCars() {
        Vehicle[] newCars = new Vehicle[cars.length];
        int i = 0;
        for (String car : cars) {
            carProperties = car.split(",");

            switch (carProperties[0]){
                case ("truck"):{
                    newCars[i] = new Truck(carProperties[0],carProperties[1], carProperties[2], Integer.parseInt(carProperties[3]),
                            Integer.parseInt(carProperties[4]), Double.parseDouble(carProperties[5]), Integer.parseInt(carProperties[6]));
                    break;
                }
                case ("sedan"):{
                    newCars[i] = new Sedan(carProperties[0],carProperties[1], carProperties[2], Integer.parseInt(carProperties[3]),
                            Integer.parseInt(carProperties[4]), Double.parseDouble(carProperties[5]), Integer.parseInt(carProperties[6]));
                    break;
                }
                case ("pickup"):{
                    newCars[i] = new Pickup(carProperties[0],carProperties[1], carProperties[2], Integer.parseInt(carProperties[3]),
                            Integer.parseInt(carProperties[4]), Double.parseDouble(carProperties[5]), Integer.parseInt(carProperties[6]),
                            Integer.parseInt(carProperties[7]));
                    break;
                }
                case ("ecar"):{
                    newCars[i] = new ECar(carProperties[0],carProperties[1], carProperties[2], Integer.parseInt(carProperties[3]),
                            Integer.parseInt(carProperties[4]), Double.parseDouble(carProperties[5]), Integer.parseInt(carProperties[6]),
                            Integer.parseInt(carProperties[7]));
                    break;
                }

            }

             i++;
        }


        return newCars;
    }


}
