package ua.hillel.javaElementary.hw12.utils;

import java.io.*;

public class Reader {
    private static String text;

    public static String readFile(File fileName){

        byte[] file = new byte[(int) fileName.length()];

        try (FileInputStream fis = new FileInputStream(fileName)){
            fis.read(file);

        }catch (IOException ioe){
            System.out.println("IOException");
        }
        text = new String(file);

        return text;
    }
}
