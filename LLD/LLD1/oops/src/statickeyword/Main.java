package statickeyword;

public class Main {
    public static void main(String[] args) {
        Utils utils = new Utils();
        utils.PI = 5.2; // advisable to make static variable as final
        System.out.println(utils.PI);
        System.out.println(Utils.PI);

        // For static everything happens at compile time, no runtime polymorphism
    }
}
