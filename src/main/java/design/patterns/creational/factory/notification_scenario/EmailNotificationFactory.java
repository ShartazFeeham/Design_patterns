package design.patterns.creational.factory.notification_scenario;

public class EmailNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
