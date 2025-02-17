package design.patterns.creational.factory.notification_scenario;

public class EmailNotification implements Notification {
    @Override
    public void send(String s) {
        System.out.println("Sending an email notification");
    }

    @Override
    public boolean checkPreference() {
        System.out.println("Checking email preference");
        return true;
    }
}
