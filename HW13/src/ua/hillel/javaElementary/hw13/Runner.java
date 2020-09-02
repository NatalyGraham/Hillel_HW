package ua.hillel.javaElementary.hw13;

import java.util.LinkedList;

public class Runner {

    public static void main(String[] args) {
        //List intList = new List();
        List intList = new List(new Integer[]{9, -5, 3, 96, 46, 32, 795, 15, 65});
        System.out.println(intList);
        //System.out.println("List is empty " + intList.isListEmpty());
        /*intList.addFirst(15);
        intList.addLast("String");
        intList.addFirst(false);
        intList.addFirst(Math.PI);
        //*/
        //intList.initializeList();

        //intList.printList();
        System.out.println(intList.getHead());
        System.out.println(intList.getNode(4));

        intList.add(4, 111);
        System.out.println(intList.getNode(4));
        intList.printList();
        //System.out.println(intList.getLength());

        //System.out.println("List is empty " + intList.isListEmpty());


    }
}
