public class HW04Task3 {
    public static void main(String[] args) {

        int[] array = {44, 65, 559, 535, 337, 665, 466, 89985, 7, 0, 3, 546, 3571, 7};

        for (int currentNumber : array
        ) {
            int changableNumber = currentNumber;
            int initialNumberLength;
            if (changableNumber == 0) {
                initialNumberLength = 1;
            } else {
                initialNumberLength = (int) Math.ceil(Math.log10(changableNumber + 0.1));
            }

            int numberLength = initialNumberLength;
            int[] digitsInNumber = new int[numberLength];
            for (int i = 0; i < digitsInNumber.length; i++) {
                digitsInNumber[i] = (int) (changableNumber / (Math.pow(10, (numberLength - 1))));
                changableNumber = changableNumber - (int) (digitsInNumber[i] * Math.pow(10, numberLength - 1));
                numberLength--;
            }
            boolean isEqual = true;

            if (initialNumberLength == 1) {
                isEqual = false;
            } else {
                outer:
                for (int i = 0; i < digitsInNumber.length; i++) {
                    for (int j = i + 1; j < digitsInNumber.length; j++) {

                        if (digitsInNumber[i] == digitsInNumber[j]) {
                            isEqual = true;
                            break outer;
                        } else {
                            isEqual = false;
                        }
                    }
                }
            }
            if (isEqual == false) {
                System.out.print(currentNumber + " ");
            }
        }


    }
}

