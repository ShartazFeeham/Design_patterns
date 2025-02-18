package design.patterns.creational.abstract_factory.theme_scenario.concreteLightComponents;

import design.patterns.creational.abstract_factory.theme_scenario.uiComponents.Content;

public class LightThemeContent implements Content {
    @Override
    public void draw() {
        System.out.println("White theme content");
    }
}
