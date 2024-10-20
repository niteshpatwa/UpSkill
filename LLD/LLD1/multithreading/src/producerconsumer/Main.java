package producerconsumer;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Showroom - shared buffer
        // Producers add objects
        // Consumers remove objects
        Queue<Object> queue = new ConcurrentLinkedQueue<>();

        // Allow 5 producers in cs
        Semaphore producerSemaphore = new Semaphore(5);
        // Initially allow 0 consumers in cs
        Semaphore consumerSemaphore = new Semaphore(0);

        for(int i=0; i<1000; i++){
            Producer producer = new Producer(queue, 5, producerSemaphore, consumerSemaphore);
            Consumer consumer = new Consumer(queue, producerSemaphore, consumerSemaphore);

            Thread producerThread = new Thread(producer);
            Thread consumerThread = new Thread(consumer);

            producerThread.start();
            consumerThread.start();
        }

        Thread.sleep(1000);
        System.out.println(queue.size());
    }
}
