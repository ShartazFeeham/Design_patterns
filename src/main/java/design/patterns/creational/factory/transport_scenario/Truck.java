package design.patterns.creational.factory.transport_scenario;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by truck");
    }

    @Override
    public double calculateCost(int distance) {
        return 1.5 * distance;
    }

    @Override
    public int calculateTime(int distance) {
        return Math.min(1, distance / 60);
    }
}
