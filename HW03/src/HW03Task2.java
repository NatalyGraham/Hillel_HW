public class HW03Task2 {
    public static void main(String[] args) {
        //int[] initialArray = {45, 68, 532, 535, 4985, 492, 795, 1, 546, 7951, 7};
        int initialNumber = 19;
        int sqrtOfNumber = (int) Math.sqrt(initialNumber) + 1;
        int[] array = new int[sqrtOfNumber];
        int initialization = 2;

        for (int i = 0; i < sqrtOfNumber - 1; i++) {
            array [i] = initialization++;
            int ost = (int) initialNumber % array [i];
            System.out.print(array [i] + " ");
            System.out.println();
            if (ost != 0) {
                System.out.println(initialNumber);
            }
        }

/*        for (int currentElement : initialArray
        ) {
            int sqrtOfNumber = (int) Math.sqrt(currentElement) + 1;
            int primeNumber = 1;
            int[] primeNumbers = new int[sqrtOfNumber];
            for (int i = 0; i < sqrtOfNumber; i++) {
                primeNumbers[i] = primeNumber++;
                boolean isPrimeNumber = currentElement%primeNumbers[i] != 0 ;
                if (isPrimeNumber){
                    System.out.print(currentElement + " ");
                }
            }//*/

            /*for (int i = 0; i < sqrtOfNumber; i++) {
                System.out.print(primeNumbers[i] + " ");
            }
            System.out.println();//*/
    }

}

