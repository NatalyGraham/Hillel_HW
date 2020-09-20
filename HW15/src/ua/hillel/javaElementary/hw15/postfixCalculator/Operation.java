package ua.hillel.javaElementary.hw15.postfixCalculator;

public class Operation<T extends Number> implements Operable<T>{
    @Override
    public T add(T a, T b) {
        return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
    }

    @Override
    public T subtract(T a, T b) {
        return (T) Double.valueOf(a.doubleValue() - b.doubleValue());
    }

    @Override
    public T multiply(T a, T b) {
        return (T) Double.valueOf(a.doubleValue() * b.doubleValue());
    }

    @Override
    public T divide(T a, T b) {
        return (T) Double.valueOf(a.doubleValue() / b.doubleValue());
    }
}
