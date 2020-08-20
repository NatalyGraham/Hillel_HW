package ua.hillel.javaElementary.hw10.flowershop.app;

import ua.hillel.javaElementary.hw10.flowershop.classes.FlowerShop;
import ua.hillel.javaElementary.hw10.flowershop.processor.*;

import java.io.IOException;

public class Runner {

    public static void main(String[] args) throws IOException {

        ConsoleProcessor proc = new ConsoleProcessor(new FlowerShop());
        proc.start();
        proc.stop();

    }
}
