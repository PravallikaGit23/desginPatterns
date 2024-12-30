package lld1.Threads.SynchronisedSolutions;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        //solutions : - maintaining locks , write synchronised blocks ,synchronised methods
        Count count = new Count();
        count.val = 0;
      // 1. Acquiring locks on the cs.
//        Lock lock = new ReentrantLock();
//
//        Adder adder = new Adder(count,lock);
//        Subtractor subtractor = new Subtractor(count,lock);
//
//        Thread t = new Thread(adder);
//        Thread t2 = new Thread(subtractor);
//        t.start();
//        t2.start();
//
//        t.join();
//        t2.join();
//
//       System.out.println(count.val);

       // 2. Synchronised blocks

        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        Thread t = new Thread(adder);
        Thread t2 = new Thread(subtractor);
        t.start();
        t2.start();

        t.join();
        t2.join();

       System.out.println(count.val);

       //synchronised methods
        // for any object accessing synchronised methods not possible whereas 2 diff objects its possible.

        //semaphore
    }

}
