abstract class BouquetPart {

    private String type;
    private String name;
    private double cost;

    public BouquetPart(String type, String name, double cost) {
        this.type = type;
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String toString(){
        return type + " " + name + ", cost: " + cost;
    }

}
