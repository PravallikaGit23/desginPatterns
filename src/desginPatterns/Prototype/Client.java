package desginPatterns.Prototype;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        Regisrty reg = new Regisrty();
        ClassmateNoteBook noteBook = new ClassmateNoteBook(25,100,"ruled" , "classMate");
        reg.register("ruled100",noteBook);

        ClassmateNoteBook noteBook1 = new smallNotebook(28,10,"white","classmate","indexed");
        reg.register("whitesmall",noteBook1);

        ClassmateNoteBook book = reg.get("ruled100").clone();
        book.setFrontpage("love");
        book.setBackpage("quote on love");


        System.out.println(book.toString());

        ClassmateNoteBook book2 = reg.get("whitesmall").clone();
        book2.setFrontpage("scenery");
        book2.setBackpage("quote on shiva");
        System.out.println(book2.toString());


    }
}
