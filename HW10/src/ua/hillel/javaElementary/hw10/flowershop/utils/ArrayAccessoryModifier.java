package ua.hillel.javaElementary.hw10.flowershop.utils;

import ua.hillel.javaElementary.hw10.flowershop.classes.Accessory;
import ua.hillel.javaElementary.hw10.flowershop.classes.Flower;

public class ArrayAccessoryModifier {


    public static Accessory[] modifyAccessoryArray(Accessory[] initial, Accessory added) {

        Accessory[] modified = new Accessory[initial.length + 1];
        for (int i = 0; i < initial.length; i++) {
            modified[i] = initial[i];
        }
        modified[initial.length] = added;
        return modified;

    }
}
