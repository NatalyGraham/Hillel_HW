package ua.hillel.javaElememtary.hw17.regex.app;

import ua.hillel.javaElememtary.hw17.regex.processor.TextHandler;
import ua.hillel.javaElememtary.hw17.regex.utils.Reader;

import java.io.File;

public class Application {

    public static void main(String[] args) {

        String inputText = Reader.readFile(new File("ServoMotorText.txt"));
        TextHandler textHandler = new TextHandler(inputText);

        System.out.println("Found " + textHandler.calculatePuncts() + " punctuation signs.");

        System.out.println(textHandler.changeWords(8,'~'));

        System.out.println(textHandler.matchFirstLast());

        System.out.println(textHandler.countUniqueWords());
    }

}
