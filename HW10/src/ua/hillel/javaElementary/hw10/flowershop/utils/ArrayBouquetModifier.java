package ua.hillel.javaElementary.hw10.flowershop.utils;

import ua.hillel.javaElementary.hw10.flowershop.classes.Bouquet;

public class ArrayBouquetModifier {


    public static Bouquet[] modifyBouquetArray(Bouquet[] initial, Bouquet added) {

        Bouquet[] modified = new Bouquet[initial.length + 1];
        for (int i = 0; i < initial.length; i++) {
            modified[i] = initial[i];
        }
        modified[initial.length] = added;
        return modified;

    }
}
