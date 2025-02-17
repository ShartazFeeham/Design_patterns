package design.patterns.creational.factory.transport_scenario;

public class ShipFactory extends TransportFactory {
    @Override
    Transport createTransport() {
        return new Ship();
    }
}
