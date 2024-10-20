package synchronizedKeyword;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{
    Counter counter;

    public Subtractor(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i=0; i<10000; i++){
            counter.decrement(i);
            System.out.println(i + " Subtractor thread decrementing the value: " + counter.getValue());
        }
    }
}
