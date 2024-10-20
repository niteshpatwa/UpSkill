package synchronizedKeyword;

public class Counter {
    private int val = 0;

    public synchronized void increment(int i) {
        val += i;
    }

    public synchronized void decrement(int i) {
        val -= i;
    }

    public int getValue() {
        return val;
    }
}
