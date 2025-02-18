package design.patterns.creational.abstract_factory.theme_scenario.factories;

import design.patterns.creational.abstract_factory.theme_scenario.concreteDarkComponents.DarkThemeContent;
import design.patterns.creational.abstract_factory.theme_scenario.concreteDarkComponents.DarkThemeFooter;
import design.patterns.creational.abstract_factory.theme_scenario.concreteDarkComponents.DarkThemeNavbar;
import design.patterns.creational.abstract_factory.theme_scenario.concreteLightComponents.LightThemeSidebar;
import design.patterns.creational.abstract_factory.theme_scenario.uiComponents.Content;
import design.patterns.creational.abstract_factory.theme_scenario.uiComponents.Footer;
import design.patterns.creational.abstract_factory.theme_scenario.uiComponents.Navbar;
import design.patterns.creational.abstract_factory.theme_scenario.uiComponents.Sidebar;

public class DarkThemeFactory implements ThemeFactory {


    @Override
    public Content createContent() {
        return new DarkThemeContent();
    }

    @Override
    public Footer createFooter() {
        return new DarkThemeFooter();
    }

    @Override
    public Navbar createNavbar() {
        return new DarkThemeNavbar();
    }

    @Override
    public Sidebar createSidebar() {
        return new LightThemeSidebar();
    }
}
