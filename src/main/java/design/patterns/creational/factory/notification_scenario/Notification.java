package design.patterns.creational.factory.notification_scenario;

public interface Notification {
    void send(String message);
    boolean checkPreference();
}
