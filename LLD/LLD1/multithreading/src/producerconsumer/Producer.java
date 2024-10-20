package producerconsumer;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    Queue<Object> sharedBuffer;
    int capacity;
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;

    public Producer(Queue<Object> sharedBuffer, int capacity, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.sharedBuffer = sharedBuffer;
        this.capacity = capacity;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    @Override
    public void run() {
        try {
            producerSemaphore.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        sharedBuffer.add(new Object());
        consumerSemaphore.release();
    }
}
