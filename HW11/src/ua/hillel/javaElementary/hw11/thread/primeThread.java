package ua.hillel.javaElementary.hw11.thread;

import ua.hillel.javaElementary.hw11.arrayUtils.ArrayModifier;
import ua.hillel.javaElementary.hw11.processor.Processor;

public class primeThread implements Runnable {

    private int[] initialArray;
    private int[] filteredArray = new int[0];

    public primeThread(int[] array) {
        this.initialArray = array;

    }

    @Override
    public void run() {

        int[] primes = Processor.getPrimes();

        filteredArray = makeFilteredArray();
        Processor.setPrimes(ArrayModifier.modifyArray(primes, filteredArray));
        System.out.println("Thread " + Thread.currentThread().getName() + "get " + initialArray.length + " numbers to compute.");

    }

    private int[] makeFilteredArray() {
        int[] modArray = new int[0];

        for (int currentNumber : initialArray) {
            if (currentNumber == 1 || currentNumber == 2 || currentNumber == 3 || currentNumber == 5) {
                modArray = ArrayModifier.modifyArray(modArray, currentNumber);
            }

            for (int i = 2; i < currentNumber / 2; i++) {


                if (currentNumber % i == 0) {
                    break;
                } else if (i == (currentNumber / 2 - 1)) {
                    modArray = ArrayModifier.modifyArray(modArray, currentNumber);

                }
            }
        }
        return modArray;
    }

}
