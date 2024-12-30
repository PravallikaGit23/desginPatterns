package lld1.Threads.mergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Sorter implements Callable<List<Integer>> {
    private List<Integer> arrayToSort;
    private ExecutorService executor;
    public Sorter(List<Integer> list, ExecutorService executorService) {
        arrayToSort = list;
        executor = executorService;
    }
    @Override
    public List<Integer> call() {
        //Base
        if(arrayToSort.size() <= 1)
            return arrayToSort;
        // Recursively split array
        int middle = arrayToSort.size() / 2;
        List<Integer> leftList = arrayToSort.subList(0, middle);
        List<Integer> rightList = arrayToSort.subList(middle, arrayToSort.size());

        Sorter leftSorter = new Sorter(leftList, executor);
        Sorter rightSorter = new Sorter(rightList, executor);

        Future<List<Integer>> leftFuture = executor.submit(leftSorter);
        Future<List<Integer>> rightFuture = executor.submit(rightSorter);

        List<Integer> leftSortedList;
        List<Integer> rightSortedList;
        try {
           leftSortedList = leftFuture.get();
           rightSortedList = rightFuture.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }


        return merge(leftSortedList,rightSortedList);
    }
    private List<Integer> merge(List<Integer> leftSortedList, List<Integer> rightSortedList) {
        List<Integer> mergedList = new ArrayList<Integer>();
        //merge logic
        int i=0,j=0;
        while(i < leftSortedList.size() && j < rightSortedList.size()) {
            if(leftSortedList.get(i) < rightSortedList.get(j)) {
                mergedList.add(leftSortedList.get(i));
                i++;
            }
            else{
                mergedList.add(rightSortedList.get(j));
                j++;
            }
        }
        while(i < leftSortedList.size()) {
            mergedList.add(leftSortedList.get(i));
            i++;
        }
        while(j < rightSortedList.size()) {
            mergedList.add(rightSortedList.get(j));
            j++;
        }
        return mergedList;
    }
}
