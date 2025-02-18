package design.patterns.creational.abstract_factory.ui_scenario;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}
