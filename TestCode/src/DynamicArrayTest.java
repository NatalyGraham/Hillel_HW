public class DynamicArrayTest {

    private int[] initialArray = new int[0];//{1,2,3,4,7};
    private int toAdd = 73;

    private int[] modifyArray(int[] initial, int added) {
        int[] modified = new int[initial.length + 1];
        for (int i = 0; i < initial.length; i++) {
            modified[i] = initial[i];
        }
        modified[initial.length] = added;
        return modified;
    }

    public static void main(String[] args) {

        DynamicArrayTest test = new DynamicArrayTest();
        int[] modifiedArray = new int[0];
        for (int i = 0; i < 5; i++) {
            modifiedArray = test.modifyArray(modifiedArray, test.toAdd);
            test.toAdd +=1;
        }
       //=test.modifyArray(test.o1, test.toAdd);
        for (int j : modifiedArray) {
            System.out.println(j);
        }
    }

}
