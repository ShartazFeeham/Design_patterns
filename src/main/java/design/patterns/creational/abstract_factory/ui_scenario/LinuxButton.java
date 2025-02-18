package design.patterns.creational.abstract_factory.ui_scenario;

public class LinuxButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created LinuxButton.");
    }
}
