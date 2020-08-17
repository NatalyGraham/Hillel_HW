public class Bouquet {

    private int bouquetLifetime;
    private int[] bouquetPartQuantity = new int[0];
    private double bouquetCost;
    private BouquetPart[] bouquetParts = new BouquetPart[0];




    public void addBouquetPart(BouquetPart bp, int quantity){
        bouquetParts = ArrayModifier.modifyArray(bouquetParts, bp);
        bouquetPartQuantity = ArrayIntModifier.modifyArray(bouquetPartQuantity, quantity);
    }

    public double calculateBouquetCost() {
        bouquetCost = 0;
        int i = 0;
        for (BouquetPart part : bouquetParts) {
            bouquetCost = bouquetCost + part.getCost()*bouquetPartQuantity[i];
            i++;
        }

        return bouquetCost;
    }

    public BouquetPart[] getBouquetParts() {
        return bouquetParts;
    }

    @Override
    public String toString(){
        String out = "The bouquet consists of: \n";
        int i = 1;
        for (BouquetPart p:bouquetParts) {
            out = out + i + ". " +  p.toString() + ". Quantity = " + bouquetPartQuantity[i-1] + "\n";
            i++;
        }
        return out;
        //"bouquet consists of: " + bouquetParts.toString();
    }

}
