package design.patterns.creational.factory.transport_scenario;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by ship");
    }

    @Override
    public double calculateCost(int distance) {
        return 0.2 * distance;
    }

    @Override
    public int calculateTime(int distance) {
        return Math.min(1, distance / 60);
    }
}
