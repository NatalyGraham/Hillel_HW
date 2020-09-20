package ua.hillel.javaElementary.hw15.postfixCalculator;

public class Runner {

    public static void main(String args[]) {
        String args2[] = {"2", "+", "2", "*", "3", "/", "4" , "+", "2"};
        Processor processor = new Processor();
        System.out.println(processor.eval(args2));

    }

}
