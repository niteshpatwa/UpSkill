package encapsulation;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student nitesh = new Student();
        nitesh.name = "Nitesh";
        nitesh.email = "nitesh@gmail.com";
        nitesh.psp = 90.5;
        nitesh.scheduleTASession();
    }
}