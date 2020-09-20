package ua.hillel.javaElementary.hw15.taxi.comparator.impl;


import ua.hillel.javaElementary.hw15.taxi.model.Vehicle;
import java.util.Comparator;

public class FuelConsumptionComparator<T extends Vehicle> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return (int) ((o1.getFuelConsumption() - o2.getFuelConsumption()) * 100);
    }

}
