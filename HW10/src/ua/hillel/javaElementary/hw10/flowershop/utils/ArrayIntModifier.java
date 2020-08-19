package ua.hillel.javaElementary.hw10.flowershop.utils;

public class ArrayIntModifier {


    public static int[] modifyArray(int[] initial, int added) {

        int[] modified = new int [initial.length + 1];
        for (int i = 0; i < initial.length; i++) {
            modified[i] = initial[i];
        }
        modified[initial.length] = added;
        return modified;

    }
}
