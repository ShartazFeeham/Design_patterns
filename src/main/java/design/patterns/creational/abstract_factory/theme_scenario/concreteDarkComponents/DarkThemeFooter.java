package design.patterns.creational.abstract_factory.theme_scenario.concreteDarkComponents;

import design.patterns.creational.abstract_factory.theme_scenario.uiComponents.Footer;

public class DarkThemeFooter implements Footer {
    @Override
    public void draw() {
        System.out.println("Dark theme footer");
    }
}
