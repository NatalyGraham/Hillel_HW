//import ua.hillel.javaElementary.HW09.taxi.model.Vehicle;

public class ArrayModifier {


    public static BouquetPart[] modifyArray(BouquetPart[] initial, BouquetPart added) {

        BouquetPart[] modified = new BouquetPart[initial.length + 1];
        for (int i = 0; i < initial.length; i++) {
            modified[i] = initial[i];
        }
        modified[initial.length] = added;
        return modified;

    }
}
