package polymorphism;

public class Instructor extends User {
    int val1 = 12;
    int val2 = 20;

    @Override
    public void login(){
        System.out.println("Instructor is logged in!");
    }
}
