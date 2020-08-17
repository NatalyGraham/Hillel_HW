import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppRunner {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) {
        mainMenu();

    }

    public static void mainMenu(){

        System.out.println("Main menu: ");
        System.out.println("1. Create bouquet");
        System.out.println("2. Change bouquet");
        System.out.println("3. View bouquet");
        System.out.println("-1. Exit");

        int choice = -1;
        do{
            try {
                choice = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                System.out.println("unexpected input");
            }
            switch (choice){
                case (1): {
                    bouquetMenu();
                    break;
                }
 /*               case (2):{

                    break;
                }
                case (3):{

                    break;
                }
                case (4):{

                    break;
                }//*/
                case (-1):{
                    try {
                        reader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }while (choice != -1);

    }

    private static void bouquetMenu(){
        System.out.println("Choose composition");
        System.out.println("1. Choose flowers");
        System.out.println("2. Choose accessories");
        System.out.println("-1. Exit");

        int choice = -1;
        do {
            try {
                choice = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                System.out.println("unexpected input");
            }
            switch (choice) {
                case (1): {
                    flowerMenu();
                    break;
                }
                case (2): {
                    createAccessoryMenu();
                    break;
                }
                case (-1):{
                    mainMenu();
                }

            }
        }while (choice != -1);
    }

    private static void flowerMenu(){
        System.out.println("1. Choose flower");
        System.out.println("2. Add flower");
        System.out.println("3. Modify flower");
        System.out.println("-1. Exit");

        int choice = -1;
        do {
            try {
                choice = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                System.out.println("unexpected input");
            }
            switch (choice) {
                case (1): {
                    bouquetMenu();
                    break;
                }
                case (-1):{
                    mainMenu();
                }

            }
        }while (choice != -1);
    }

    private static void createAccessoryMenu(){
        System.out.println("Choose accessories");
        System.out.println("1. Film");
        System.out.println("2. Ribbon");
        System.out.println("0. No accessory in bouquet");
        System.out.println("-1. Exit");

        int choice = -1;
        do {
            try {
                choice = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                System.out.println("unexpected input");
            }
            switch (choice) {
                case (1): {
                    bouquetMenu();
                    break;
                }
                case (-1):{
                    mainMenu();
                }

            }
        }while (choice != -1);
    }



}
