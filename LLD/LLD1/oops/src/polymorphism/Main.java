package polymorphism;

public class Main {
    public static void main(String[] args) {
        // NOTE: Runtime polymorphism is application only to methods and not variables
        Instructor instructor = new Instructor();
        instructor.login();
        System.out.printf("%d %d\n", instructor.val1, instructor.val2);

        User user = new User();
        user.login();
        System.out.printf("%d\n", user.val1);

        User ic = new Instructor();
        ic.login();
        System.out.printf("%d\n", ic.val1);
    }
}
