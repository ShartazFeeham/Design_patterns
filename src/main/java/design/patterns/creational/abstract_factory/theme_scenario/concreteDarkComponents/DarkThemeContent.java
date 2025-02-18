package design.patterns.creational.abstract_factory.theme_scenario.concreteDarkComponents;

import design.patterns.creational.abstract_factory.theme_scenario.uiComponents.Content;

public class DarkThemeContent implements Content {
    @Override
    public void draw() {
        System.out.println("Dark theme content");
    }
}
