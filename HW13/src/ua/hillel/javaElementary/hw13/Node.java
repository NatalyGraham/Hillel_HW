package ua.hillel.javaElementary.hw13;

public class Node<T> {

    private T value;
    private Node<T> link;

    /*public String toString() {
        String strLink;
        try {
            strLink = link.getValue().toString();
        } catch (NullPointerException npe) {
            strLink = "";
        }
        return value + " --> " + strLink;
    }//*/

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getLink() {
        return link;
    }

    public void setLink(Node<T> link) {
        this.link = link;
    }


}
