package inheritence;

public class Instructor extends User {
    private double avgRating;

    public Instructor(String name, String email, String password, double avgRating) {
        super(name, email, password);
        this.avgRating = avgRating;
    }

    void scheduleSession(String batch){
        System.out.println("Session is scheduled for batch: " + batch);
    }
}
