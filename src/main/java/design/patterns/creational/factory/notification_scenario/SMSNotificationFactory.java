package design.patterns.creational.factory.notification_scenario;

public class SMSNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
