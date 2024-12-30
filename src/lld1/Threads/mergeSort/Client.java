package lld1.Threads.mergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(353);
        list.add(904);
        list.add(58);
        list.add(6);
        list.add(65787);
        list.add(812);
        list.add(569);


        ExecutorService executorService  = Executors.newCachedThreadPool();
        Sorter sorter = new Sorter(list,executorService);
        Future<List<Integer>> sortedList = executorService.submit(sorter);

        try {
            System.out.println(sortedList.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}

