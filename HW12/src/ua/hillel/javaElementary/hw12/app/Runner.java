package ua.hillel.javaElementary.hw12.app;

import ua.hillel.javaElementary.hw12.processor.TaxPark;
import ua.hillel.javaElementary.hw12.utils.CarMaker;
import ua.hillel.javaElementary.hw12.utils.Reader;
import ua.hillel.javaElementary.hw12.utils.Writer;

import java.io.File;

public class Runner {

    public static void main(String[] args) {

        String taxis = Reader.readFile(new File("input.txt"));
        CarMaker newCars = new CarMaker(taxis);
        TaxPark taximo = new TaxPark(newCars.makeCars());

        int minSpeed = 100;
        int maxSpeed = 180;
        String fileName = "Speed between " + minSpeed + " and " + maxSpeed + ".txt";
        File reportFile = new File(fileName);
        Writer reportWriter = new Writer(taximo.makeReport(taximo.speedCars(minSpeed, maxSpeed)));
        reportWriter.writeFile(reportFile);

        fileName = "Sorted cars by fuel consumption.txt";
        reportFile = new File(fileName);
        reportWriter = new Writer(taximo.makeReport(taximo.sortCars()));
        reportWriter.writeFile(reportFile);

    }

}
