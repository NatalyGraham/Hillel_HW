package ua.hillel.javaElementary.hw10.flowershop.exceptions;

public class NegativeLengthException extends Exception {

    private String message = "negative number input.";

    public String toString() {
        return ("NegativeLengthException occurred by: " + message);
    }
}
