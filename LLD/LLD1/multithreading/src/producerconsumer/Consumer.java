package producerconsumer;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    Queue<Object> sharedBuffer;
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;

    public Consumer(Queue<Object> sharedBuffer, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.sharedBuffer = sharedBuffer;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    @Override
    public void run(){
        try {
            consumerSemaphore.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        sharedBuffer.remove();
        producerSemaphore.release();
    }
}
