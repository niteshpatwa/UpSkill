package locks;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {
    Counter counter;
    Lock lock;

    public Adder(Counter counter, Lock lock) {
        this.counter = counter;
        this.lock = lock;
    }

    @Override
    public void run() {
        for(int i=0; i<100; i++){
            lock.lock();
            counter.val += i;
            System.out.println(i + " Adder thread incrementing the value: " + counter.val);
            lock.unlock();
        }
    }
}
