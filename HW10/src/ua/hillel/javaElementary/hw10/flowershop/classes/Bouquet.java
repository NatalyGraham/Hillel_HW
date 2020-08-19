package ua.hillel.javaElementary.hw10.flowershop.classes;

import ua.hillel.javaElementary.hw10.flowershop.utils.ArrayAccessoryModifier;
import ua.hillel.javaElementary.hw10.flowershop.utils.ArrayFlowerModifier;
import ua.hillel.javaElementary.hw10.flowershop.utils.ArrayModifier;

public class Bouquet {

    private int bouquetLifetime;
    private double bouquetCost;
    private Flower[] flowers = new Flower[0];
    private Accessory[] accessories = new Accessory[0];

    public Bouquet(){ }

    public Bouquet(Flower[] flowers, Accessory[] accessories) {
        this.flowers = flowers;
        this.accessories = accessories;
    }

    public void addFlower (Flower flower){
        //flowers = ArrayFlowerModifier.modifyFlowerArray(flowers, flower);
        flowers = ArrayFlowerModifier.modifyFlowerArray(flowers, flower);
    }

    public void addAccessory (Accessory accessory){
        accessories = ArrayAccessoryModifier.modifyAccessoryArray(accessories, accessory);
    }

    private double calculateBouquetCost() {
        bouquetCost = 0;
        for (Flower flower : flowers) {
            bouquetCost = bouquetCost + flower.getCost();
        }
        for (Accessory accessory: accessories) {
            bouquetCost = bouquetCost + accessory.getCost();
        }

        return bouquetCost;
    }

    public Flower[] getFlowers() {
        return flowers;
    }

    @Override
    public String toString(){
        String out = "The bouquet price is " + calculateBouquetCost() + ", it consists of: \n";
        int i = 1;
        for (Flower flower:flowers) {
            out = out + "    " + i + ". " +  flower.toString() + "\n";
            i++;
        }
        for (Accessory accessory:accessories) {
            out = out + "    " + i + ". " +  accessory.toString() + "\n";
            i++;
        }
        return out;
        //"bouquet consists of: " + bouquetParts.toString();
    }

}
