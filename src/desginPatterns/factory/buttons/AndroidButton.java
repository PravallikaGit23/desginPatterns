package desginPatterns.factory.buttons;

public class AndroidButton implements Button {

    @Override
    public void changeSize() {
      System.out.println("Change size by AndroidButton");
    }
}
