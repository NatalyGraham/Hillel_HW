public class Flower extends BouquetPart{

    //private String type;
    //private String name;
    //private double cost;
    private double stem;
    private int lifetime;


    public Flower(String type, String name, double cost, double stem, int lifetime) {
        super(type, name, cost);
        this.stem = stem;
        this.lifetime = lifetime;
    }

    /*public String getType() {
        return type;
    }//*/

    /*public void setType(String type) {
        this.type = type;
    }//*/

    /*public String getName() {
        return name;
    }//*/

    /*public void setName(String name) {
        this.name = name;
    }//*/

    /*public double getCost() {
        return cost;
    }//*/

    /*public void setCost(double cost) {
        this.cost = cost;
    }//*/

    public double getStem() {
        return stem;
    }

    public void setStem(double stem) {
        this.stem = stem;
    }

    public int getLifetime() {
        return lifetime;
    }

    public void setLifetime(int lifetime) {
        this.lifetime = lifetime;
    }

    @Override
    public String toString() {
        return super.toString()+ " " + stem + ", lifetime: " + lifetime;
    }
}
