package design.patterns.creational.factory.transport_scenario;

public class TrucFactory extends TransportFactory {
    @Override
    Transport createTransport() {
        return new Truck();
    }
}
