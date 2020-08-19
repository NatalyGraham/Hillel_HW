package ua.hillel.javaElementary.hw10.flowershop.utils;

import ua.hillel.javaElementary.hw10.flowershop.classes.Accessory;

public class ArrayModifier {


    public static Object[] modifyArray(Object[] initial, Object added) {

        Object[] modified = new Object[initial.length + 1];
        for (int i = 0; i < initial.length; i++) {
            modified[i] = initial[i];
        }
        modified[initial.length] = added;
        return modified;

    }
}
