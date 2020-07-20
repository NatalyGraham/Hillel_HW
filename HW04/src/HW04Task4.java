public class HW04Task4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};
        int matrixSize = (int) (Math.ceil(Math.sqrt(array.length)));

        int i = 0;
        while (i <= (array.length / matrixSize)) {
            for (int j = i * matrixSize; (j < (matrixSize * (i + 1)) && j < array.length); j++) {
                if ((int) Math.ceil(Math.log10(array[j] + 0.1)) > 1){
                    System.out.print(array[j] + "  ");
                }else {
                    System.out.print(array[j] + "   ");
                }
            }
            System.out.println();
            i++;
        }

    }
}
