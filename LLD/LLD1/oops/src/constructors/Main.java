package constructors;

public class Main {
    public static void main(String[] args) {
        Instructor instructor1 = new Instructor("John", 8.2);
        System.out.println(instructor1);

        Instructor instructor2 = new Instructor(instructor1);
        System.out.println(instructor2);
    }
}
