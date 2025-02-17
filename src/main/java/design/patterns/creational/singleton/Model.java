package design.patterns.creational.singleton;

public class Model {
    private Model() {
        System.out.println("Model created");
    }

    private static Model INSTANCE = null;

    public static synchronized Model getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Model();
        }
        return INSTANCE;
    }
}
