package design.patterns.creational.abstract_factory.theme_scenario;

import design.patterns.creational.abstract_factory.theme_scenario.factories.DarkThemeFactory;
import design.patterns.creational.abstract_factory.theme_scenario.factories.LightThemeFactory;
import design.patterns.creational.abstract_factory.theme_scenario.factories.ThemeFactory;
import design.patterns.creational.abstract_factory.theme_scenario.processes.Customizable;
import design.patterns.creational.abstract_factory.theme_scenario.processes.Drawable;
import design.patterns.creational.abstract_factory.theme_scenario.uiComponents.Content;
import design.patterns.creational.abstract_factory.theme_scenario.uiComponents.Footer;
import design.patterns.creational.abstract_factory.theme_scenario.uiComponents.Navbar;
import design.patterns.creational.abstract_factory.theme_scenario.uiComponents.Sidebar;

import java.util.Scanner;

public class Demo {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ThemeFactory theme = getThemeFactory();
        drawUI(theme);
    }

    private static void drawUI(ThemeFactory theme) {
        Navbar navbar = theme.createNavbar();
        Sidebar sidebar = theme.createSidebar();
        Content content = theme.createContent();
        Footer footer = theme.createFooter();

        draw(navbar, sidebar, content, footer);
        customize(navbar);
    }

    private static void draw(Drawable ... drawables) {
        for (Drawable drawable : drawables) {
            drawable.draw();
        }
    }

    private static void customize(Customizable ... customizes) {
        for (Customizable customizable : customizes) {
            customizable.customize();
        }
    }

    private static ThemeFactory getThemeFactory() {
        return switch (scanner.nextLine().toLowerCase()) {
            case "dark" -> new DarkThemeFactory();
            case "light" -> new LightThemeFactory();
            default -> throw new IllegalArgumentException("Invalid theme");
        };
    }
}
