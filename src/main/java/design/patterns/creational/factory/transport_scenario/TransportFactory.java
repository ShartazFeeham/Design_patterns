package design.patterns.creational.factory.transport_scenario;

public abstract class TransportFactory {
    abstract Transport createTransport();

    public void helper() {
        System.out.println("Helper method in transport factory");
    }
}
