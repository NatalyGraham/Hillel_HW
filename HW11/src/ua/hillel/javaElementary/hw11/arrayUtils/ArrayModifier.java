package ua.hillel.javaElementary.hw11.arrayUtils;

public class ArrayModifier {

    public static int[] modifyArray(int[] initial, int added) {

        int[] modified = new int[initial.length + 1];
        for (int i = 0; i < initial.length; i++) {
            modified[i] = initial[i];
        }
        modified[modified.length - 1] = added;
        return modified;

    }

    public static int[] modifyArray(int[] initial, int[] added) {
        int modifiedLength = initial.length + added.length;

        int[] modified = new int[modifiedLength];
        for (int i = 0; i < modified.length; i++) {
            if (i < initial.length) {
                modified[i] = initial[i];
            } else {
                modified[i] = added[i - initial.length];
            }
        }
        return modified;

    }

}
