package ua.hillel.javaElementary.hw11.test;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            TestThread tt = new TestThread();
            tt.start();
        }

    }

}
