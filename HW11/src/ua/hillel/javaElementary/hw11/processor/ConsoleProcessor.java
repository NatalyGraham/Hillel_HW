package ua.hillel.javaElementary.hw11.processor;

import ua.hillel.javaElementary.hw11.exceptions.NotNullException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleProcessor {

    BufferedReader reader;
    Processor processor;


    public void start() throws IOException {

        int startNumber = 0;
        int lastNumber = 0;
        int numberOfThreads = 0;
        String inputError = "Wrong input. Input a number, please.";

        reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input first number from the range");

        try {
            startNumber = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException nfe) {
            System.out.println(inputError);
            startNumber = Integer.parseInt(reader.readLine());
        }

        System.out.println("Input last number from the range");

        try {
            lastNumber = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException nfe) {
            System.out.println(inputError);
            lastNumber = Integer.parseInt(reader.readLine());
        }

        System.out.println("Input number of threads for calculation");

        try {
            numberOfThreads = Integer.parseInt(reader.readLine());
            isNull(numberOfThreads);
        } catch (NumberFormatException nfe) {
            System.out.println(inputError);
            numberOfThreads = Integer.parseInt(reader.readLine());
        } catch (NotNullException nne) {
            System.out.println("Input a number more then 0.");
            numberOfThreads = Integer.parseInt(reader.readLine());
        }

        long startTime = System.currentTimeMillis();
        processor = new Processor(startNumber, lastNumber, numberOfThreads);
        processor.divideByThreads();
        processor.printPrimes();
        long endTime = System.currentTimeMillis();
        System.out.println();
        System.out.println("Total ex time: " + (endTime - startTime) + "ms");


    }

    private boolean isNull(int number) throws NotNullException {
        if (number == 0) {
            throw new NotNullException();
        } else {
            return false;
        }
    }

    public void stop() throws IOException {
        reader.close();
    }

}
