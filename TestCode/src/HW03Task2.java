public class HW03Task2 {
    public static void main(String[] args) {
        int[] initialArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18 ,19 };

        for (int currentNumber : initialArray) {
            if (currentNumber ==1 || currentNumber == 2 || currentNumber ==3 || currentNumber == 5) {
                System.out.print(currentNumber + " ");
            }

            for (int i = 2; i < currentNumber/2; i++) {


                if (currentNumber%i ==0){
                    break;
                } else if (i == (currentNumber/2-1)){
                    System.out.print(currentNumber + " ");

                }
            }
        }

    }

}