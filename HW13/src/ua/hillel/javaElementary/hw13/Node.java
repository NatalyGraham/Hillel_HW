package ua.hillel.javaElementary.hw13;

public class Node<T> {

    private T value;
    private Node<T> link;

    /*public Node (T value, Node link){
        this.value = value;
        this.link = link;
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

    public String toString() {
        return value + " --> " + link.getValue();
    }


}
