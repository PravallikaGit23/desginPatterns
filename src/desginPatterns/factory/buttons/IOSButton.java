package desginPatterns.factory.buttons;

public class IOSButton implements Button {

    @Override
    public void changeSize() {

        System.out.println("Change size by IOSButton");
    }
}
