package design.patterns.creational.factory.transport_scenario;

public interface Transport {
    void deliver();
    double calculateCost(int distance);
    int calculateTime(int distance);
}
