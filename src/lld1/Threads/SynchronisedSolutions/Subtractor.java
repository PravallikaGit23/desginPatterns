package lld1.Threads.SynchronisedSolutions;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Subtractor implements Runnable {
    private Count count;
    Lock lock ;

    Subtractor(Count count) {
        this.count = count;
    }
    Subtractor(Count count, Lock lock){
        this.count = count;
        this.lock = lock;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            //Acquiring lock on CS
//            lock.lock();
//            count.val -= i;
//            lock.unlock();

            synchronized (count) {
                count.val -= i;
            }
        }
    }

}
