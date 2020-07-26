import static java.lang.String.valueOf;

public class RecursionTask {

    static private int sumResult = 0;

    public static void main(String[] args) {
        int someNumber = 9857;
        printTrace(someNumber);
        System.out.println();
        System.out.println(sumDigits(someNumber));

    }

    public static void printTrace(int number) {
        if (number > 1) {
            if (number != 1) {
                printTrace(number - 1);
            }
        }else {
            if (number != 1) {
                printTrace(number + 1);
            }
        }
        System.out.println(number);
    }


    public static int sumDigits(int number) {

        int absNumber = Math.abs(number);
        int numberLength = valueOf(absNumber).length();
        if (number != 0) {
            int firstDigit = (int) (absNumber / Math.pow(10, (numberLength-1)));
            if (number > 0) {
                number = number - (int) (firstDigit * Math.pow(10, (numberLength-1)));
                sumResult +=  firstDigit;
            }else {
                number = number + (int) (firstDigit * Math.pow(10, (numberLength-1)));
                sumResult +=  firstDigit;
            }
            sumDigits(number);

        }
        return sumResult;
    }

}
