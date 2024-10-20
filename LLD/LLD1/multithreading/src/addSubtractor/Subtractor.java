package addSubtractor;

public class Subtractor implements Runnable{
    Counter counter;

    public Subtractor(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i=0; i<1000; i++){
            counter.val -= i;
        }
    }
}
