package ua.hillel.javaElementary.hw13;

public class List<T> {

    private Node<T> head;
    private Node<T> tail;
    private int length;

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
            Node temp = getNode(index);
            Node addedNode = new Node();
            addedNode.setValue(element);
            addedNode.setLink(temp);
            getNode(index - 1).setLink(addedNode);
            length++;
        }
    }

    public void addFirst(T element) {
        Node addedNode = new Node();
        addedNode.setValue(element);

        if (head == null) {
            head = addedNode;
            tail = addedNode;
        } else {
            addedNode.setLink(head);
            head = addedNode;
        }

        length++;
    }

    public void addLast(T element) {
        Node addedNode = new Node();
        addedNode.setValue(element);

        if (tail == null) {
            head = addedNode;
        } else {
            tail.setLink(addedNode);
        }

        tail = addedNode;
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
                System.out.println(index + " more then last list index. Can not add the element.");
            }
        } else {
            Node previous = getNode(index - 1);
            Node next = getNode(index + 1);
            previous.setLink(next);
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

        if (tail == null) {
            messageEmptyList();
        } else {
            tail = getNode(length - 2);
            tail.setLink(null);
            length--;
        }

    }

    public void replace(int firstIndex, int secondIndex) {
        Node firstNode = getNode(firstIndex);
        Node secondNode = getNode(secondIndex);
        remove(firstIndex);
        add(firstIndex, (T) secondNode.getValue());
        remove(secondIndex);
        add(secondIndex, (T) firstNode.getValue());
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
        try {
            checkElementIndex(index);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(index + " more then last list index. Can not get node.");
        }
        if (index == length - 1) {
            return tail;
        } else {
            Node temp = head;
            int counter = 0;
            while (counter != index) {
                temp = temp.getLink();
                counter++;
            }
            return temp;
        }
    }

    private void checkElementIndex(int index) {
        if (!isIndexExists(index))
            throw new IndexOutOfBoundsException(index);
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
