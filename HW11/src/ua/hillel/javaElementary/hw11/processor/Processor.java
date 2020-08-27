package ua.hillel.javaElementary.hw11.processor;

import ua.hillel.javaElementary.hw11.arrayUtils.ArrayModifier;
import ua.hillel.javaElementary.hw11.thread.primeThread;

public class Processor {
    private int firstNumber;
    private int lastNumber;
    private int numberOfThreads;
    private static int[] primes = new int[0];

    public Processor(int first, int last, int threads) {
        this.firstNumber = first;
        this.lastNumber = last;
        this.numberOfThreads = threads;
    }

    private int[] makeArray(int first, int last) {

        int[] result = new int[0];
        for (int counter = first; counter <= last; counter++) {
            result = ArrayModifier.modifyArray(result, counter);
        }

        return result;
    }

    public void divideByThreads() {

        int subarraySize = ((lastNumber - firstNumber) / numberOfThreads + 1);
        int lastSubarraySize = lastNumber - firstNumber - subarraySize * (numberOfThreads - 1) + 1;


        for (int i = 0; i < numberOfThreads; i++) {
            int first = i * subarraySize + firstNumber;
            int last;
            if (i == numberOfThreads - 1) {
                last = lastNumber;
            } else {
                last = lastNumber - lastSubarraySize - subarraySize * (numberOfThreads - i - 2);
            }

            primeThread thread = new primeThread(makeArray(first, last));
            Thread newThread = new Thread(thread);
            newThread.start();

            try {
                newThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printPrimes() {
        System.out.println("Primes between " + firstNumber + " and " + lastNumber + " : ");
        for (int numb : primes) {
            System.out.print(numb + " ");
        }
    }

    public static int[] getPrimes() {
        return primes;
    }

    public static void setPrimes(int[] prims) {
        primes = prims;
    }

}
