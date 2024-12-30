package desginPatterns.factory;

import desginPatterns.factory.buttons.AndroidButton;
import desginPatterns.factory.buttons.IOSButton;
import desginPatterns.factory.dropdown.AndroidDropdown;
import desginPatterns.factory.dropdown.IOSDropdown;

public class AndroidFactory implements UIFactory{
    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidDropdown createDropdown() {
        return new AndroidDropdown();
    }
}
