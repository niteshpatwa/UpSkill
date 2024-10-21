package lambdas;

import java.util.Optional;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        });
        thread.start();

        Thread thread2 = new Thread(() ->
                System.out.println("Namaste Duniya")
        );
        thread2.start();

        Optional<Integer> optionalInteger = Optional.of(1);
        Function<Integer, Integer> mapper = x -> x + 2;
        optionalInteger.map(mapper);
    }
}
