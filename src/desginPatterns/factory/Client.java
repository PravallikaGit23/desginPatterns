package desginPatterns.factory;

import desginPatterns.factory.buttons.Button;
import desginPatterns.factory.dropdown.Dropdown;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatforms.ANDROID);
        UIFactory uiFactory = flutter.createUIFactory();
        Button button = uiFactory.createButton();
        button.changeSize();

        Dropdown dropdown = uiFactory.createDropdown();
        dropdown.changecolor();
    }
}
