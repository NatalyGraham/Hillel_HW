package ua.hillel.javaElementary.HW09.triangle.utils;

@FunctionalInterface
public interface Function<T, R> {

    R convert(T t);

}
