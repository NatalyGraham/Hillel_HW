package ua.hillel.javaElementary.hw15.LinkedList;

import java.util.Iterator;

public class List<T extends Comparable<T>> {

    private Node<T> head;
    private int length;


    public List() {
    }

    public List(T[] array) {
        for (T temp : array) {
            addLast(temp);
        }
    }

    public void add(int index, T element) {

        if (index == length) {
            addLast(element);
        } else if (index == 0) {
            addFirst(element);
        } else if (index > length) {
            try {
                checkElementIndex(index);
            } catch (IndexOutOfBoundsException ex) {
                System.out.println(index + " more then last list index. Can not add the element.");
            }
        } else {
            Node<T> temp = getNode(index - 1);
            temp.link = new Node<>(element, temp.link);
            length++;
        }
    }

    public void addFirst(T element) {
        Node<T> addedNode = new Node<>();
        addedNode.value = element;

        if (head != null) {
            addedNode.link = head;
        }
        head = addedNode;
        length++;
    }

    public void addLast(T element) {
        Node<T> addedNode = new Node<>();
        addedNode.value = element;

        if (head == null) {
            head = addedNode;
        } else {
            getNode(length - 1).link = addedNode;
        }

        length++;
    }

    public void remove(int index) {

        if (index == length - 1) {
            removeLast();
        } else if (index == 0) {
            removeFirst();
        } else if (index >= length) {
            try {
                checkElementIndex(index);
            } catch (IndexOutOfBoundsException ex) {
                System.out.println(index + " more then last list index. Can not remove the element.");
            }
        } else {
            getNode(index - 1).link = getNode(index + 1);
            length--;
        }
    }

    public void removeFirst() {

        if (head == null) {
            messageEmptyList();
        } else {
            head = getNode(1);
            length--;
        }

    }

    public void removeLast() {

        if (head == null) {
            messageEmptyList();
        } else {
            getNode(length - 2).link = null;
            length--;
        }

    }

    public void replace(int firstIndex, int secondIndex) {

        if (firstIndex >= length || secondIndex >= length) {
            try {
                checkElementIndex(firstIndex);
            } catch (IndexOutOfBoundsException ex) {
                System.out.println(firstIndex + " more then last list index. Can not remove the element.");
            }
            try {
                checkElementIndex(secondIndex);
            } catch (IndexOutOfBoundsException ex) {
                System.out.println(secondIndex + " more then last list index. Can not replace the element.");
            }
        } else {
            Node<T> tempSecondLink = getNode(secondIndex).link;
            Node<T> tempPreviousToSecondLink = getNode(secondIndex - 1).link;
            getNode(secondIndex).link = getNode(firstIndex + 1);
            getNode(secondIndex - 1).link = getNode(firstIndex);
            getNode(firstIndex).link = tempSecondLink;
            if (firstIndex == 0) {
                head = tempPreviousToSecondLink;
            } else {
                getNode(firstIndex - 1).link = tempPreviousToSecondLink;
            }

        }
    }

    public int getLength() {
        return length;
    }

    public boolean isListEmpty() {

        if (length != 0) {
            return false;
        } else {
            return true;
        }

    }

    public Node<T> getNode(int index) {
        boolean hasIndex = false;
        try {
            hasIndex = checkElementIndex(index);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(index + " more then last list index. Can not get node.");
        }
        if (hasIndex) {
            Node<T> temp = head;
            int counter = 0;
            while (counter != index) {
                temp = temp.link;
                counter++;
            }
            return temp;
        } else {
            return null;
        }

    }

    private boolean checkElementIndex(int index) {
        if (!isIndexExists(index)) {
            throw new IndexOutOfBoundsException(index);
        } else {
            return true;
        }

    }

    private boolean isIndexExists(int index) {
        return index >= 0 && index < length;
    }

    private void messageEmptyList() {
        System.out.println("List is empty");
    }

    @Override
    public String toString() {
        String out = "";
        for (int i = 0; i < length; i++) {
            out = out + getNode(i).value.toString() + " --> ";
        }
        return out;
    }

    public ListIterator<T> iterator() {
        return new ListIterator<>();
    }

    private class Node<T> {

        private T value;
        private Node<T> link;

        public Node() {

        }

        public Node(T value, Node<T> link) {
            this.value = value;
            this.link = link;
        }

        public String toString(){
            return value + " --> ";
        }

    }

    private class ListIterator<E> implements Iterator<E> {

        private Node<E> curentNode;
        private int pos;

        ListIterator(){
            this.curentNode = (Node<E>) head;
            this.pos = 0;
        }

        @Override
        public boolean hasNext() {
            return pos != length;
        }

        @Override
        public E next() {

            E next = (E) curentNode;
            curentNode = curentNode.link;
            pos++;
            return next;
        }

    }

}