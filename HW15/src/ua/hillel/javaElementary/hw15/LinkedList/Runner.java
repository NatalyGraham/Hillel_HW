package ua.hillel.javaElementary.hw15.LinkedList;

import ua.hillel.javaElementary.hw15.LinkedList.List;

public class Runner {

    public static void main(String[] args) {

        List strList = new List();
        System.out.println(strList.isListEmpty());
        strList.addFirst("newElement");
        System.out.println(strList);
        System.out.println(strList.isListEmpty());

        List intList = new List(new Integer[]{7, -5, 3, 96, 46, 32, 795, 15, 65});
        System.out.println(intList);

        intList.addLast( 111);
        System.out.println(intList);

        intList.addFirst( 112);
        System.out.println(intList);

        intList.add(5, 110);
        System.out.println(intList);

        intList.removeFirst();
        System.out.println(intList);

        intList.removeLast();
        System.out.println(intList);

        intList.remove(4);
        System.out.println(intList);

        intList.replace(2,8);
        System.out.println(intList);

        intList.replace(0,8);
        System.out.println(intList);

        System.out.println(intList.getLength());

    }
}
