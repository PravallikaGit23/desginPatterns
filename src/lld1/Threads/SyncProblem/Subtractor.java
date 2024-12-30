package lld1.Threads.SyncProblem;

public class Subtractor implements Runnable {
    private Count count;
    Subtractor(Count count){
        this.count = count;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            count.val -= i;
        }
    }
}
