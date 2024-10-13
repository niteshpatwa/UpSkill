package abstractclasses;

public abstract class Animal {
    int age;

    public Animal(int age) {
        this.age = age;
    }

    abstract void walk();

    public void eat() {
        System.out.println("Eating...");
    }
}
