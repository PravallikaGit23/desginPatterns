package desginPatterns.Prototype;

public class ClassmateNoteBook implements Prototype<ClassmateNoteBook> {
    protected double price ;
    protected int noOfPages;
    protected String type;
    protected String frontpage;
    protected String backpage;
    protected String brand = "Classmate";

    public ClassmateNoteBook(double price, int noOfPages, String type,String brand) {
        this.price = price;
        this.noOfPages = noOfPages;
        this.type = type;
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public String getFrontpage() {
        return frontpage;
    }

    public void setFrontpage(String frontpage) {
        this.frontpage = frontpage;
    }

    public String getBackpage() {
        return backpage;
    }

    public void setBackpage(String backpage) {
        this.backpage = backpage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public ClassmateNoteBook clone() {
        return new ClassmateNoteBook(price, noOfPages, type, brand);
    }

    @Override
    public String toString() {
        return "ClassmateNoteBook{" +
                "price=" + price +
                ", noOfPages=" + noOfPages +
                ", type='" + type + '\'' +
                ", frontpage='" + frontpage + '\'' +
                ", backpage='" + backpage + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}

