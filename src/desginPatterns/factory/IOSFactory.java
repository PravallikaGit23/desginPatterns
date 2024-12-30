package desginPatterns.factory;

import desginPatterns.factory.buttons.Button;
import desginPatterns.factory.buttons.IOSButton;
import desginPatterns.factory.dropdown.Dropdown;
import desginPatterns.factory.dropdown.IOSDropdown;

public class IOSFactory  implements UIFactory{
    @Override
    public IOSButton createButton() {
        return new IOSButton();
    }

    @Override
    public IOSDropdown createDropdown() {
        return new IOSDropdown();
    }
}
