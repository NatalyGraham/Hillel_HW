package ua.hillel.javaElementary.hw12.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    public static void writeFile(String fileName, String text){

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))){
                bw.write(text);
        }catch (IOException ioe){
            System.out.println("IOException");
        }

    }
}
