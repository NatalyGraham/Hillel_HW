public class HW04Task2 {
    public static void main(String[] args) {
        int[] array = {-45, 68, 532, -535, 337, 0, 461, -49085, 492, 795, -3, 546, 3571, 70};

        int absCurrentNumber = Math.abs(array[0]);
        int maxLength, minLength;
        maxLength = minLength = (int) Math.ceil(Math.log10(absCurrentNumber + 0.1));
        int maxPosition, minPosition;
        maxPosition = minPosition = 0;

        for (int i = 0; i < array.length; i++) {


            absCurrentNumber = Math.abs(array[i]);
            int currentNumberLength = (int) Math.ceil(Math.log10(absCurrentNumber + 0.1));
            if (array[i] == 0) {
                currentNumberLength = 1;
                if (currentNumberLength >= maxLength) {
                    maxLength = currentNumberLength;
                    maxPosition = i;
                } else if (currentNumberLength <= minLength) {
                    minLength = currentNumberLength;
                    minPosition = i;
                }

            } else{
                if (currentNumberLength >= maxLength) {
                    maxLength = currentNumberLength;
                    maxPosition = i;
                } else if (currentNumberLength <= minLength) {
                    minLength = currentNumberLength;
                    minPosition = i;
                }
            }

        }
        System.out.println("The shortest number is " + array[minPosition] + ", it's length is " + minLength);
        System.out.println("The longest number is " + array[maxPosition] + ", it's length is " + maxLength);
    }
}
