package desginPatterns.factory;

import desginPatterns.factory.buttons.Button;
import desginPatterns.factory.dropdown.Dropdown;

public interface UIFactory
{
    Button createButton();
    Dropdown createDropdown();
}
