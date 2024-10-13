package constructors;

public class Instructor {
    String name;
    double rating;

    public Instructor() {
    }

    public Instructor(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }

    public Instructor(Instructor instructor) {
        this.name = instructor.name;
        this.rating = instructor.rating;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }
}
