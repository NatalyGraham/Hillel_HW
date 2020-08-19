package ua.hillel.javaElementary.hw10.flowershop.classes;

import ua.hillel.javaElementary.hw10.flowershop.utils.ArrayFlowerModifier;

public class Bouquet {

    private int bouquetLifetime;
    private double bouquetCost;
    private Flower[] flowers = new Flower[0];
    private Accessory[] accessories = new Accessory[0];




    public void addFlower (Flower flower){
        flowers = ArrayFlowerModifier.modifyFlowerArray(flowers, flower);
    }

    public double calculateBouquetCost() {
        bouquetCost = 0;
        int i = 0;
        for (Flower flower : flowers) {
            bouquetCost = bouquetCost + flower.getCost();
            i++;
        }

        return bouquetCost;
    }

    public Flower[] getFlowers() {
        return flowers;
    }

    @Override
    public String toString(){
        String out = "The bouquet consists of: \n";
        int i = 1;
        for (Flower flower:flowers) {
            out = out + i + ". " +  flower.toString() + "\n";
            i++;
        }
        return out;
        //"bouquet consists of: " + bouquetParts.toString();
    }

}
