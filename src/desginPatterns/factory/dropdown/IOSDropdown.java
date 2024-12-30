package desginPatterns.factory.dropdown;

public class IOSDropdown implements Dropdown{
    @Override
    public void changecolor() {
        System.out.println("AndroidDropdown changecolor");
    }
}
