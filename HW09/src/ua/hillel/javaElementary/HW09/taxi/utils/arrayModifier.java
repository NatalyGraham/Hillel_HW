package ua.hillel.javaElementary.HW09.taxi.utils;

import ua.hillel.javaElementary.HW09.taxi.model.Vehicle;

public class arrayModifier {


    public static Vehicle[] modifyArray(Vehicle[] initial, Vehicle added) {

        Vehicle[] modified = new Vehicle[initial.length + 1];
        for (int i = 0; i < initial.length; i++) {
            modified[i] = initial[i];
        }
        modified[initial.length] = added;
        return modified;

    }
}
