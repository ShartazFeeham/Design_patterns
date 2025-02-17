package design.patterns.creational.factory.notification_scenario;

public class PushNotification implements Notification {
    @Override
    public void send(String s) {
        System.out.println("Sending a push notification");
    }

    @Override
    public boolean checkPreference() {
        System.out.println("Checking push notification preference");
        return true;
    }
}
