package ua.hillel.javaElementary.hw12.utils;

import java.io.*;

public class Writer {
    private static String text;

    public Writer(String text) {
        this.text = text;
    }

    public static void writeFile(File fileName) {

        byte[] file = text.getBytes();

        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            fos.write(file);

        } catch (IOException ioe) {
            System.out.println("IOException");
        }

    }
}
