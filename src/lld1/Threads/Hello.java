package lld1.Threads;

public class Hello implements Runnable{

    public void run(){
        System.out.println("Hello World");
        System.out.println(Thread.currentThread().getName());
    }
}
