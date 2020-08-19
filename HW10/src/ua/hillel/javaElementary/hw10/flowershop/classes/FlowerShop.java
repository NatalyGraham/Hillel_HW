package ua.hillel.javaElementary.hw10.flowershop.classes;

import ua.hillel.javaElementary.hw10.flowershop.utils.ArrayFlowerModifier;

public class FlowerShop {

    private Bouquet [] bouquets = new Bouquet[0];

    public Bouquet addFlowerToBouquete(Flower flower){
        

        return bouquet;
    }

    public String printFlowers(){
        String out = "The bouquet consists of: \n";
        int i = 1;
        for (Flower flower:flowers) {
            out = out + i + ". " +  flower.toString() + "\n";
            i++;
        }
        return out;

    }


}
