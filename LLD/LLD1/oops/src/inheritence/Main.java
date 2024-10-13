package inheritence;

public class Main {
    public static void main(String[] args) {
        Instructor instructor = new Instructor("John", "john@gmail.com", "", 8.8);

        Learner learner = new Learner("Alice", "alice@gmail.com", "", 90.5);

        instructor.login();
        learner.login();

        instructor.scheduleSession("Intermediate May");
        learner.attemptContest();
    }
}
