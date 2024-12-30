package lld1.Threads;

public class PrintingNumbers implements Runnable{
    int number;
    PrintingNumbers(int i){
        number = i;
    }
      public void run(){
        System.out.println(Thread.currentThread().getName()+ " printing  : " + number );

    }
}
