package lld1.Threads.SyncProblem;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        //Problems
        Count count = new Count();
        count.val = 0;

        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        Thread t = new Thread(adder);
        Thread t2 = new Thread(subtractor);
        t.start();
        t2.start();

        t.join();
        t2.join();
       // shows Synchronised result
         ExecutorService executors = Executors.newCachedThreadPool();
        executors.submit(adder);
        executors.submit(subtractor);
       System.out.println(count.val);
    }
    //solutions : - maintaining locks , write synchronised blocks ,synchronised methods

}
