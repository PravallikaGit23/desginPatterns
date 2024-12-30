package lld1.Threads.SyncProblem;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {
    private Count count;
    Lock lock;
    Adder(Count count){
        this.count = count;
        lock = lock;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            count.val += i;
        }
    }
}
