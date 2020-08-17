public class RunnerFlower {

    public static void main(String[] args) {
        Flower rose = new Flower("Flower", "Rose", 9.85, 70, 2);
        Flower lily = new Flower("Flower", "Lily", 15.85, 50, 6);
        Flower violet = new Flower("Flower","Violet", 5, 10, 3);

        Accessory film = new Accessory("Accessory","Film", 1.5);
        Accessory ribbon = new Accessory("Accessory","Ribbon", 2.5);

        Bouquet bq1 = new Bouquet();
        bq1.addBouquetPart(rose, 3);
        bq1.addBouquetPart(violet, 2);
        bq1.addBouquetPart(lily, 12);
        bq1.addBouquetPart(film, 1);
        bq1.addBouquetPart(ribbon, 1);

        System.out.println();
        System.out.println(bq1.calculateBouquetCost());
        System.out.println();
        System.out.println(bq1.toString());

    }
}
