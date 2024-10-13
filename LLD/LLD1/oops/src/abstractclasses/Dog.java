package abstractclasses;

public class Dog extends Animal {
    public Dog(int age) {
        super(age);
    }

    @Override
    void walk() {
        System.out.println("Dog walk");
    }
}
