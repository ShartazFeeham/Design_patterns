package design.patterns.creational.factory.notification_scenario;

public class Demo {
    public static void main(String[] args) {
        sendNotification(new PushNotificationFactory());
        sendNotification(new EmailNotificationFactory());
        sendNotification(new SMSNotificationFactory());
    }

    private static void sendNotification(NotificationFactory factory) {
        Notification notification = factory.createNotification();

        if (notification.checkPreference()) {
            notification.send("Hello from notification!");
        }
    }
}
