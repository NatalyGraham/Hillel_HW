public class HW03Task3 {

    public static void main(String[] args) {
        int[] fibonacciSequence = new int[20];

        for (int i = 0; i < fibonacciSequence.length; i++) {
            if (i == 0 || i == 1) {
                fibonacciSequence[i] = 1;
            } else {
                fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
            }
            System.out.print(fibonacciSequence[i] + " ");
        }


    }
}
