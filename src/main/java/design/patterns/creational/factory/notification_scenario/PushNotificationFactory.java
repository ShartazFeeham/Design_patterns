package design.patterns.creational.factory.notification_scenario;

public class PushNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
