package design.patterns.creational.singleton;

public class Model2 {
    private Model2() {
        System.out.println("Model2 created");
    }

    private static Model2 INSTANCE = null;

    public static synchronized Model2 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Model2();
        }
        return INSTANCE;
    }
}
