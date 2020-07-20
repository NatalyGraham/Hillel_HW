public class HW04Task1 {
    public static void main(String[] args) {
        int[] array = {45, 68, 532, 535, 337, 865, 461, 4985, 492, 795, 3, 546, 3571, 7};
        //int[] subArray = {45, 532, 535, 4985, 492, 795, 546, 3571, 7};
        int[] subArray = {0, 1, 2, 4, 9, 5};
        //int[] subArray = {45, 68, 532, 543, 337, 865, 461, 4455, 492, 795, 24, 546, 3851, 7};

        int i = array.length - 1;
        int j = subArray.length - 1;

        while (i >= 0 && j >= 0) {
            if (array[i] == subArray[j]) {
                i--;
                j--;
            } else {
                i--;
            }
        }
        if (j == -1) {
            System.out.println("Subarray is a part of main Array");
        } else if (j != -1 & i == -1) {
            System.out.println("Subarray is not a part of main Array");
        }
    }
}
