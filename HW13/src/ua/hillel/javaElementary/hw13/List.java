package ua.hillel.javaElementary.hw13;

/*
Инициализация списка(пустого и на основании массива)
Добавление узла в список внутрь по нидексу +
Удаление узла из начала, конца и n-го элемента
Вывод элементов списка (toString()) +
Взаимообмен двух узлов списка (по двум идексам)
Количество элементов в списке +
Проверить список на пустоту +
 */

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
        checkElementIndex(index);
        if (index == length) {
            addLast(element);
        } else {
            Node temp = getNode(index);
            Node addedNode = new Node();
            addedNode.setValue(element);
            addedNode.setLink(temp);
            getNode(index - 1).setLink(addedNode);

        }
    }

    public Node<T> getNode(int index) {
        if (index == length) {
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

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getValue());
            temp = temp.getLink();
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

    private void checkElementIndex(int index) {
        if (!isIndexExists(index))
            throw new IndexOutOfBoundsException(index);
    }

    private boolean isIndexExists(int index) {
        return index >= 0 && index <= length;
    }

    public String toString(){
        String out = "";
        for (int i = 0; i < length ; i++) {
            out = out + getNode(i).getValue() + " --> ";
        }
        return out;
    }

    public Node<T> getHead() {
        return head;
    }

    public Node<T> getTail() {
        return tail;
    }


}
