public class HW03Task2 {
    public static void main(String[] args) {
        int[] initialArray = {45, 68, 532, 535, 337, 865, 461, 4985, 492, 795, 3, 546, 3571, 7};
        int counter = 2;

        for (int currentNumber : initialArray
        ) {
            while (currentNumber % counter != 0 || counter == Math.sqrt(currentNumber)) {
                counter++;
            }
            if (counter == currentNumber || currentNumber == 1) {
                System.out.print(currentNumber + " ");
            }
            counter = 2;
        }

    }

}

