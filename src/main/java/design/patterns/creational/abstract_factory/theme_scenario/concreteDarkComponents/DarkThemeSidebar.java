package design.patterns.creational.abstract_factory.theme_scenario.concreteDarkComponents;

import design.patterns.creational.abstract_factory.theme_scenario.uiComponents.Sidebar;

public class DarkThemeSidebar implements Sidebar {
    @Override
    public void draw() {
        System.out.println("Dark theme sidebar");
    }
}
