package ua.hillel.javaElementary.hw10.flowershop.classes;

import ua.hillel.javaElementary.hw10.flowershop.utils.ArrayBouquetModifier;

public class FlowerShop {

    private Bouquet[] bouquets = new Bouquet[0];
    private Bouquet bouquet = new Bouquet();
    private Flower[] flowers = new Flower[0];
    private Accessory[] accessories = new Accessory[0];

    public Bouquet[] addBouquets(Bouquet bouquet) {
        return bouquets = ArrayBouquetModifier.modifyBouquetArray(bouquets, bouquet);
    }

    public String printBouquets() {
        String out = "You made " + bouquets.length + " bouquets: \n";
        int i = 1;
        for (Bouquet bouquet : bouquets) {
            out = out + i + ". " + bouquet.toString() + "\n";
            i++;
        }
        return out;

    }

    public Bouquet sortFlowersByFresh(Bouquet bouquet) {
        bouquet.sortFlowers();
        return bouquet;
    }

    public void printChosenFlowersByStemLength(Bouquet bouquet, int min, int max) {
        bouquet.printFlowers(min, max);
    }

    public Bouquet[] getBouquets() {
        return bouquets;
    }

}
