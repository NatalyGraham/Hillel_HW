package ua.hillel.javaElementary.hw11.app;

import ua.hillel.javaElementary.hw11.processor.ConsoleProcessor;

import java.io.IOException;

public class Runner {

    public static void main(String[] args) throws IOException {

        ConsoleProcessor proc = new ConsoleProcessor();
        proc.start();
        proc.stop();


    }
}
