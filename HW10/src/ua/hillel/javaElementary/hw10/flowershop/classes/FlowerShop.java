package ua.hillel.javaElementary.hw10.flowershop.classes;

import ua.hillel.javaElementary.hw10.flowershop.utils.ArrayAccessoryModifier;
import ua.hillel.javaElementary.hw10.flowershop.utils.ArrayBouquetModifier;
import ua.hillel.javaElementary.hw10.flowershop.utils.ArrayFlowerModifier;

public class FlowerShop {

    private Bouquet[] bouquets = new Bouquet[0];
    private Bouquet bouquet = new Bouquet();
    private Flower[] flowers = new Flower[0];
    private Accessory[] accessories = new Accessory[0];

    /*public FlowerShop() {
        bouquets = new Bouquet[0];
        bouquet = new Bouquet();
    }//*/

    public Bouquet[] createBouquets (Bouquet bouquet){
        return bouquets = ArrayBouquetModifier.modifyBouquetArray(bouquets, bouquet);
    }

    public Bouquet addFlowerToBouquete(Flower flower) {
        bouquet.addFlower(flower);
        return bouquet;
    }

    private Bouquet addAccessoryToBouquete(Accessory accessory) {
        bouquet.addAccessory(accessory);
        return bouquet;
    }
    public Bouquet[] addBouquets(Bouquet bouquet){
        return bouquets = ArrayBouquetModifier.modifyBouquetArray(bouquets, bouquet);
    }

    public Bouquet[] modifyBouquets(int i, Bouquet modifiedBouquet){

        return bouquets = ArrayBouquetModifier.modifyBouquetArray(bouquets, bouquet);
    }

    public Flower[] createFlowers (Flower flower){
        return flowers = ArrayFlowerModifier.modifyFlowerArray(flowers, flower);
    }

    public Accessory[] createAccessories (Accessory accessory){
        return accessories = ArrayAccessoryModifier.modifyAccessoryArray(accessories, accessory);
    }

    public String printBouquets() {
        String out = "You made " +bouquets.length + " bouquets: \n";
        int i = 1;
        for (Bouquet bouquet : bouquets) {
            out = out + i + ". " + bouquet.toString() + "\n";
            i++;
        }
        return out;

    }


    public void createBouquet() {
        Bouquet bouquet = new Bouquet();
    }

    public Bouquet[] getBouquets() {
        return bouquets;
    }
}
