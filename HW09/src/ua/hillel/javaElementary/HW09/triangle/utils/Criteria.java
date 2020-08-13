package ua.hillel.javaElementary.HW09.triangle.utils;

@FunctionalInterface
public interface Criteria<T> {

    boolean test(T t);

}
