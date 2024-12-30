package desginPatterns.singleTonPattern;

public class LoggerSingleThreaded {
    public static LoggerSingleThreaded logger;
    private LoggerSingleThreaded(){

    }

    public static LoggerSingleThreaded getInstance(){
                if (logger == null) {
                    logger = new LoggerSingleThreaded();
                }
        return logger;
    }

    public void printing(){
        System.out.println("Printing single threaded logger");
        for (int i = 0; i < 10; i++) {
            System.out.print(i +"   ");
        }
    }
}
