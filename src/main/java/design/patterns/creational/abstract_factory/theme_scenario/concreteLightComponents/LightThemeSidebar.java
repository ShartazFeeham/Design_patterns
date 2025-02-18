package design.patterns.creational.abstract_factory.theme_scenario.concreteLightComponents;

import design.patterns.creational.abstract_factory.theme_scenario.uiComponents.Sidebar;

public class LightThemeSidebar implements Sidebar {
    @Override
    public void draw() {
        System.out.println("White theme sidebar");
    }
}
