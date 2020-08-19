package ua.hillel.javaElementary.hw10.flowershop.utils;

import ua.hillel.javaElementary.hw10.flowershop.classes.Flower;

public class ArrayFlowerModifier {


    public static Flower[] modifyFlowerArray(Flower[] initial, Flower added) {

        Flower[] modified = new Flower[initial.length + 1];
        for (int i = 0; i < initial.length; i++) {
            modified[i] = initial[i];
        }
        modified[initial.length] = added;
        return modified;

    }
}
