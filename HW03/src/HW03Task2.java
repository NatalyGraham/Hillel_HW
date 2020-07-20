public class HW03Task2 {
    public static void main(String[] args) {
        int[] initialArray = {45, 68, 532, 535, 337, 865, 461, 4985, 492, 795, 1, 546, 3571, 7};
        int counter = 2;
        //System.out.println((int) (Math.ceil(Math.sqrt(337))));

        for (int currentNumber : initialArray
        ) {
            if (currentNumber == 1) {
                System.out.print(currentNumber + " ");
            } else {
                while (currentNumber % counter != 0 && counter != (int) (Math.ceil(Math.sqrt(currentNumber)))) {
                    counter++;
                }
                if (counter == (int) (Math.ceil(Math.sqrt(currentNumber))) || currentNumber == 1) {
                    System.out.print(currentNumber + " ");
                }
                counter = 2;
            }
        }

    }

}