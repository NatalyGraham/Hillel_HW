package ua.hillel.javaElementary.hw10.flowershop.classes;

import ua.hillel.javaElementary.hw10.flowershop.utils.ArrayAccessoryModifier;
import ua.hillel.javaElementary.hw10.flowershop.utils.ArrayFlowerModifier;

public class Bouquet {

    private double bouquetCost;
    private Flower[] flowers = new Flower[0];
    private Accessory[] accessories = new Accessory[0];

    public void addFlower(Flower flower) {
        flowers = ArrayFlowerModifier.modifyFlowerArray(flowers, flower);
    }

    public void addAccessory(Accessory accessory) {
        accessories = ArrayAccessoryModifier.modifyAccessoryArray(accessories, accessory);
    }

    private double calculateBouquetCost() {
        bouquetCost = 0;
        for (Flower flower : flowers) {
            bouquetCost = bouquetCost + flower.getCost();
        }
        for (Accessory accessory : accessories) {
            bouquetCost = bouquetCost + accessory.getCost();
        }

        return bouquetCost;
    }

    public Flower[] sortFlowers() {
        int k = flowers.length;
        Flower tempFlower = null;
        for (int i = 0; i < k; i++) {
            for (int j = 1; j < (k - i); j++) {
                if (flowers[j - 1].getLifetime() > flowers[j].getLifetime()) {
                    tempFlower = flowers[j - 1];
                    flowers[j - 1] = flowers[j];
                    flowers[j] = tempFlower;
                }
            }
        }
        return flowers;
    }

    private Flower[] chooseFlowers(int min, int max) {
        Flower[] chosenByLengthFlowers = new Flower[0];
        for (Flower flo : flowers) {
            if (flo.getStem() >= min && flo.getStem() <= max) {
                chosenByLengthFlowers = ArrayFlowerModifier.modifyFlowerArray(chosenByLengthFlowers, flo);
            }
        }
        return chosenByLengthFlowers;
    }

    public void printFlowers(int min, int max) {
        Flower[] chosenByLengthFlowers = chooseFlowers(min, max);
        String out = "";
        int i = 1;
        if (chosenByLengthFlowers.length > 0) {
            for (Flower flo : chooseFlowers(min, max)) {

                out = out + i + ". " + flo + "\n";
                i++;

            }
        } else {
            out = out + "there is no flower with stem length between " + min + " and " + max;
        }

        System.out.println(out);
    }


    @Override
    public String toString() {
        String out = "The bouquet price is " + calculateBouquetCost() + ", it consists of: \n";
        int i = 1;
        for (Flower flower : flowers) {
            out = out + "    " + i + ". " + flower.toString() + "\n";
            i++;
        }
        for (Accessory accessory : accessories) {
            out = out + "    " + i + ". " + accessory.toString() + "\n";
            i++;
        }
        return out;

    }

}
