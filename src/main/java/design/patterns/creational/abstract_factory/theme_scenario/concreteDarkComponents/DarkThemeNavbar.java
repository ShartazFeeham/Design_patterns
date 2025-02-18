package design.patterns.creational.abstract_factory.theme_scenario.concreteDarkComponents;

import design.patterns.creational.abstract_factory.theme_scenario.uiComponents.Navbar;

public class DarkThemeNavbar implements Navbar {
    @Override
    public void draw() {
        System.out.println("Dark theme navbar");
    }

    @Override
    public void customize() {
        System.out.println("Customizing dark theme navbar");
    }
}
