package ua.hillel.javaElementary.hw15.postfixCalculator;

public interface Operable<T extends Number> {

    T add(T a, T b);

    T subtract(T a, T b);

    T multiply(T a, T b);

    T divide(T a, T b);

}
