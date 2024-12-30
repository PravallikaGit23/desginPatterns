package lld1.Threads;

import java.util.concurrent.Callable;

public class CallableExample implements Callable<Integer> {
    static int i= 0;
    public Integer call(){
        for(int j=0;j<100;j++){
            System.out.println("loading");
            i++;

        }
        return i;
    }
}
