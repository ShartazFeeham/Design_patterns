package design.patterns.creational.abstract_factory.theme_scenario.concreteLightComponents;

import design.patterns.creational.abstract_factory.theme_scenario.uiComponents.Navbar;

public class LightThemeNavbar implements Navbar {
    @Override
    public void draw() {
        System.out.println("White theme navbar");
    }

    @Override
    public void customize() {
        System.out.println("Customizing white theme navbar");
    }
}
