package design.patterns.creational.factory.transport_scenario;

import java.util.Scanner;

public class Demo {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        TransportFactory factory = getTransportFactory();
        Transport transport = factory.createTransport();
        deliveryDetails(transport);
    }

    private static TransportFactory getTransportFactory() {
        return switch (scanner.next().toLowerCase()) {
            case "truck" -> new TrucFactory();
            case "ship" -> new ShipFactory();
            default -> {
                System.out.println("Invalid transport type, returning default: Truck");
                yield new TrucFactory();
            }
        };
    }

    private static void deliveryDetails(Transport transport) {
        displayTime(transport);
        displayCost(transport);
        transport.deliver();
    }

    private static void displayCost(Transport transport) {
        System.out.println(transport.calculateCost(100));
    }

    private static void displayTime(Transport transport) {
        System.out.println(transport.calculateTime(100));
    }
}
