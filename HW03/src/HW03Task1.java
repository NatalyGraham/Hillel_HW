public class HW03Task1 {
    public static void main(String[] args) {
        int[] initialArray = {45, 68, 532, 535, 4985, 492, 795, 0, 546, 7951, 4};

        for (int currentElement : initialArray
        ) {
            int modulo = currentElement % 2;
            if (modulo == 0) {
                System.out.print(currentElement + " ");
            }
        }

        System.out.println();

        for (int currentElement : initialArray
        ) {
            int modulo = currentElement % 2;
            if (modulo != 0) {
                System.out.print(currentElement + " ");
            }
        }

    }
}
