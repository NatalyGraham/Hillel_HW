package ua.hillel.javaElementary.hw11.exceptions;

public class NotNullException extends Exception {
    private String message = "0 number input.";

    public String toString() {
        return ("NegativeLengthException occurred by: " + message);
    }
}
