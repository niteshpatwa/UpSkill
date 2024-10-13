package inheritence;

public class Learner extends User{
    private double psp;

    public Learner(String name, String email, String password, double psp) {
        super(name, email, password);
        this.psp = psp;
    }

    void attemptContest(){
        System.out.println(name + " attempts contest");
    }
}
