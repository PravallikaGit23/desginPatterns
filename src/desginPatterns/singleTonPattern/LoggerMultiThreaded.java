package desginPatterns.singleTonPattern;

import java.util.concurrent.locks.Lock;

public class LoggerMultiThreaded {
    public static LoggerMultiThreaded logger;
    private LoggerMultiThreaded(){
    }

    public static LoggerMultiThreaded getInstance() {
        if (logger == null) {
            synchronized (LoggerMultiThreaded.class) {
                if (logger == null) {
                    logger = new LoggerMultiThreaded();
                }
            }
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
