package design.patterns.creational.abstract_factory.ui_scenario;

public class LinuxFactory implements AbstractFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }
}
