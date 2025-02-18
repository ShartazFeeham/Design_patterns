package design.patterns.creational.abstract_factory.theme_scenario.concreteLightComponents;

import design.patterns.creational.abstract_factory.theme_scenario.uiComponents.Footer;

public class LightThemeFooter implements Footer {
    @Override
    public void draw() {
        System.out.println("White theme footer");
    }
}
