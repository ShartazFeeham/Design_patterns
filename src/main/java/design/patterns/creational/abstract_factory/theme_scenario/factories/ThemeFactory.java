package design.patterns.creational.abstract_factory.theme_scenario.factories;

import design.patterns.creational.abstract_factory.theme_scenario.uiComponents.Content;
import design.patterns.creational.abstract_factory.theme_scenario.uiComponents.Footer;
import design.patterns.creational.abstract_factory.theme_scenario.uiComponents.Navbar;
import design.patterns.creational.abstract_factory.theme_scenario.uiComponents.Sidebar;

public interface ThemeFactory {
    Content createContent();
    Footer createFooter();
    Navbar createNavbar();
    Sidebar createSidebar();
}
