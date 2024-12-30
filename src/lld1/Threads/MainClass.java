package lld1.Threads;

import java.util.concurrent.*;

import static java.lang.Thread.sleep;

public class MainClass {
    public static void main(String[] args) throws ExecutionException {
// --------------------------------------------------------------
// PRINTING HELLO
//      Hello hello = new Hello();
//      Thread thread = new Thread(hello);
//      thread.start();
//      try {
//          sleep(3000);
//      }
//      catch (Exception e){
//          e.printStackTrace();
//      }
//      System.out.println(Thread.currentThread().getName());
//
// ---------------------------------------------------------------
//      //PRINTING 1 TO 100 ON DIFFERENT THREADS
//
//        for(int i =1 ; i <= 100 ; i++){
//            PrintingNumbers printNumbers = new PrintingNumbers(i);
//            Thread thread = new Thread(printNumbers);
//             thread.start();
//        }
//----------------------------------------------------------------------------
//        // using executor Service
//        Executor executor = Executors.newFixedThreadPool(5);
//
//        for(int i =1 ; i <= 100 ; i++){
//            PrintingNumbers printNumbers = new PrintingNumbers(i);
//            executor.execute(printNumbers);
//
//        }

        //----------------------------------------------------------------------
//Impleemmting Callable with cached thread pool.
        Executor executor = Executors.newCachedThreadPool();
        CallableExample callableExample = new CallableExample();
        Future<Integer> future = ((ExecutorService) executor).submit(callableExample);
        try {
            int value = future.get();
            System.out.println(value);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
