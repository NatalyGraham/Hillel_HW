package ua.hillel.javaElementary.hw15.textReader.app;

import ua.hillel.javaElementary.hw15.textReader.processor.WordFinder;
import ua.hillel.javaElementary.hw15.textReader.utils.Reader;

import java.io.File;

public class Application {

    public static void main(String[] args) {

        String inputData = Reader.readFile(new File("Some text.txt"));
        WordFinder finder = new WordFinder(inputData);
        finder.printReport();

    }
}
