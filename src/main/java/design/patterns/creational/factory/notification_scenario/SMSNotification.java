package design.patterns.creational.factory.notification_scenario;

public class SMSNotification implements Notification {
    @Override
    public void send(String s) {
        System.out.println("Sending an SMS notification");
    }

    @Override
    public boolean checkPreference() {
        System.out.println("Checking SMS preference");
        return true;
    }
}
