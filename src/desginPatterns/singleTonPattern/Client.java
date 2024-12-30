package desginPatterns.singleTonPattern;

public class Client {
    public static void main(String[] args) {
        LoggerSingleThreaded logger = LoggerSingleThreaded.getInstance();
        logger.printing();
        System.out.println(logger);

        LoggerSingleThreaded logger2 = LoggerSingleThreaded.getInstance();
        logger2.printing();
        System.out.println(logger2);

        LoggerMultiThreaded logger3 = LoggerMultiThreaded.getInstance();
        Thread t = new Thread();
        t.start();
    }
}
