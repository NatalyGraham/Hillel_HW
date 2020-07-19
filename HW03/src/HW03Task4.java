public class HW03Task4 {
    public static void main(String[] args) {
        int[] initialArray = {45, 68, 532, 535, 337, 865, 461, 4985, 492, 795, 3, 546, 3571, 7};
        int maxNumber = initialArray[0];
        int minNumber = initialArray[0];

        for (int currentNumber : initialArray
        ) {
            if (currentNumber >= maxNumber) {
                maxNumber = currentNumber;
            }
            if (currentNumber <= minNumber) {
                minNumber = currentNumber;
            }
        }
        System.out.println("Maximum is " + maxNumber);
        System.out.println("Minimum is " + minNumber);
    }
}
