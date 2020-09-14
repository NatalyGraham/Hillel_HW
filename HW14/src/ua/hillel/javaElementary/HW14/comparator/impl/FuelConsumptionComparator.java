package ua.hillel.javaElementary.HW14.comparator.impl;

import ua.hillel.javaElementary.HW14.comparator.Comparable;
import ua.hillel.javaElementary.HW14.model.Vehicle;

public class FuelConsumptionComparator<T extends Vehicle> implements Comparable<T> {

    @Override
    public int compare(T o1, T o2) {
        return (int) ((o1.getFuelConsumption() - o2.getFuelConsumption()) * 100);
    }

}
