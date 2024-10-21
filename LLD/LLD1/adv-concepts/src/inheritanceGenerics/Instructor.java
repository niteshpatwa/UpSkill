package inheritanceGenerics;

public class Instructor extends User {
    Double rating;

    public Instructor(String name, double rating) {
        super(name);
        this.rating = rating;
    }
}
