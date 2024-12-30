package lld1.ExceptionHandling;

public class ErrorsExample {
    public static void main(String[] args) {
        printing();
    }
    public static void printing() {
        System.out.println("hello");
        printing();
    }
//    Exception in thread "main" java.lang.StackOverflowError
//    at java.base/java.io.FileOutputStream.write(FileOutputStream.java:349)
//    at java.base/java.io.BufferedOutputStream.flushBuffer(BufferedOutputStream.java:81)
//    at java.base/java.io.BufferedOutputStream.flush(BufferedOutputStream.java:142)
}
