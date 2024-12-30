package lld1.Threads.SynchronisedSolutions;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Adder implements Runnable {
    private Count count;
    Lock lock ;

    public Adder(Count count) {
        this.count = count;
    }
    Adder(Count count, Lock lock){
        this.count = count;
        this.lock = lock;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            //Acquiring lock on CS
//            lock.lock();
//            count.val += i;
//            lock.unlock();
             synchronized (count) {
                 count.val += i;
             }
        }
    }
}
