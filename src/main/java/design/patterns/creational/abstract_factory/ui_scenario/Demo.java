package design.patterns.creational.abstract_factory.ui_scenario;

public class Demo {
    public static void main(String[] args) {
        AbstractFactory factory = getFactory();
        buildUI(factory);
    }

    private static void buildUI(AbstractFactory factory) {
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();
        button.paint();
        checkbox.paint();
    }

    private static AbstractFactory getFactory() {
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("windows")) {
            return new WindowsFactory();
        } else if (osName.contains("linux")) {
            return new LinuxFactory();
        } else {
            throw new RuntimeException("Unknown operating system.");
        }
    }
}
