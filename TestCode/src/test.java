public class test {

    public static void main(String[] args) {
        try{
            String value = "29.1";
            float value1 = Float.valueOf(value);
            double value1d = Double.valueOf(value);
            int value1i = Integer.valueOf(value);
            System.out.println(value1 + 1.0);
            System.out.println(value1d + 1.0);
            System.out.println((value1 + 1.0) == 30.1);
            System.out.println((29.1 + 1.0) == 30.1);
            int value2i = value1i / 0;
            double value2 = value1/0.0;
            System.out.println(value2);
            System.out.println(29.1/0);
            System.out.println(29.1/0);
        }catch (NumberFormatException ex){
            System.out.println("NumberFormatException");
        }catch (ArithmeticException ex){
            System.out.println("ArithmeticException");
        }
    }
}
