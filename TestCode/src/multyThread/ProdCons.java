package multyThread;

public class ProdCons {

    public static void main(String[] args) {
        Q q = new Q();
        new Prod(q);
        new Cons(q);
    }
}
