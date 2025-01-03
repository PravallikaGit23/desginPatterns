package desginPatterns.Prototype;

public class smallNotebook extends  ClassmateNoteBook{
    String index;

    public smallNotebook(double price, int noOfPages, String type, String brand, String index) {
        super(price, noOfPages, type, brand);
        this.index = index;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    @Override
    public smallNotebook clone() {
        return new smallNotebook(price, noOfPages, type, brand, index);
    }

    @Override
    public String toString() {
        return "smallNotebook{" +
                "index='" + index + '\'' +
                super.toString()+
                '}';
    }
}
