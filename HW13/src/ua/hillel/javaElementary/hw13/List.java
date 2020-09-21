package ua.hillel.javaElementary.hw13;

import java.util.LinkedList;

public class List<T> {

    private Node<T> head;
    private int length;


    private class Node<T> {

        private T value;
        private Node<T> link;

        public String toString() {
            String strLink;
            try {
                strLink = link.getValue().toString();
            } catch (NullPointerException npe) {
                strLink = "";
            }
            return value + " --> " + strLink;

        }

        public Node() {
        }

        public Node(T value, Node<T> link) {
            this.value = value;
            this.link = link;
        }

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

    public List() {
    }

    public List(T[] array) {
        for (T temp : array) {
            addLast(temp);
        }
    }

    public void add(int index, T element) {

        if (index == length - 1) {
            addLast(element);
        } else if (index == 0) {
            addFirst(element);
        } else if (index >= length) {
            try {
                checkElementIndex(index);
            } catch (IndexOutOfBoundsException ex) {
                System.out.println(index + " more then last list index. Can not add the element.");
            }
        } else {
            Node<T> temp = getNode(index);
            Node<T> addedNode = new Node<>(element, temp);
            //addedNode.setValue(element);
            //addedNode.setLink(temp);
            getNode(index - 1).setLink(addedNode);
            length++;
        }
    }

    public void addFirst(T element) {
        Node<T> addedNode = new Node<>();
        addedNode.setValue(element);

        if (head != null) {
            addedNode.setLink(head);
        }
        head = addedNode;
        length++;
    }

    public void addLast(T element) {
        Node<T> addedNode = new Node<>();
        addedNode.setValue(element);

        if (head == null) {
            head = addedNode;
        } else {
            getNode(length - 1).setLink(addedNode);
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
            getNode(index - 1).setLink(getNode(index + 1));
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
            getNode(length - 2).setLink(null);
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
            Node<T> tempSecondLink = getNode(secondIndex).getLink();
            Node<T> tempPreviousToSecondLink = getNode(secondIndex - 1).getLink();
            getNode(secondIndex).setLink(getNode(firstIndex + 1));
            getNode(secondIndex - 1).setLink(getNode(firstIndex));
            getNode(firstIndex).setLink(tempSecondLink);
            if (firstIndex == 0) {
                head = tempPreviousToSecondLink;
            } else {
                getNode(firstIndex - 1).setLink(tempPreviousToSecondLink);
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
                temp = temp.getLink();
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

    public String toString() {
        String out = "";
        for (int i = 0; i < length; i++) {
            out = out + getNode(i).getValue() + " --> ";
        }
        return out;
    }

}