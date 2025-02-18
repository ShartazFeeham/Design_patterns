package design.patterns.creational.abstract_factory.theme_scenario.factories;

import design.patterns.creational.abstract_factory.theme_scenario.concreteLightComponents.LightThemeContent;
import design.patterns.creational.abstract_factory.theme_scenario.concreteLightComponents.LightThemeFooter;
import design.patterns.creational.abstract_factory.theme_scenario.concreteLightComponents.LightThemeNavbar;
import design.patterns.creational.abstract_factory.theme_scenario.concreteLightComponents.LightThemeSidebar;
import design.patterns.creational.abstract_factory.theme_scenario.uiComponents.Content;
import design.patterns.creational.abstract_factory.theme_scenario.uiComponents.Footer;
import design.patterns.creational.abstract_factory.theme_scenario.uiComponents.Navbar;
import design.patterns.creational.abstract_factory.theme_scenario.uiComponents.Sidebar;

public class LightThemeFactory implements ThemeFactory {
    @Override
    public Content createContent() {
        return new LightThemeContent();
    }

    @Override
    public Footer createFooter() {
        return new LightThemeFooter();
    }

    @Override
    public Navbar createNavbar() {
        return new LightThemeNavbar();
    }

    @Override
    public Sidebar createSidebar() {
        return new LightThemeSidebar();
    }
}
