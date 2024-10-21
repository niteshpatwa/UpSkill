package generics;

public class Main<X, Y> {

    public void doSomething(X key, Y value) {
        System.out.println(key);
        System.out.println(value);
    }

    public static<X, Y> void doSomethingMore(X key, Y value) {
        System.out.println(key);
        System.out.println(value);
    }

    public static void main(String[] args) {
        /*
        * Using Object instead of generics-
        * 1. Compile-Time warnings suppressed(due to explicit typecasting)
        * 2. Hard to debug
        * */

        Pair<Double, Double> pair = new Pair(1.0, 2.0);
        Pair student = new Pair("John", 4.0);
        Double latitude = (Double) pair.getFirst();
        String name = (String) student.getFirst();
        System.out.println(latitude + " " + name);
    }
}
