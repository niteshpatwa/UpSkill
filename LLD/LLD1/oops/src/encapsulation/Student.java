package encapsulation;

public class Student {
    String name;
    String email;
    double psp;

    public void scheduleTASession(){
        System.out.printf("%s scheduled a TA session\n", name);
    }
}
