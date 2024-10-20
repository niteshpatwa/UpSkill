package callables;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        long startTime = System.currentTimeMillis();

        List<Integer> list = List.of(5, 7, 4, 3, 2, 6);

        ExecutorService executorService = Executors.newFixedThreadPool(20);
        MergeSorter mergeSorter = new MergeSorter(list, executorService);
//        List<Integer> sortedList = mergeSorter.sort();

        Future<List<Integer>> sortedList =  executorService.submit(mergeSorter);

        // Waiting for futures to finish
        System.out.println("Hello World!");

        long endTime = System.currentTimeMillis();
        System.out.println(sortedList.get() + " Time: " + (endTime - startTime) + " ms");

        executorService.shutdown();
    }
}
