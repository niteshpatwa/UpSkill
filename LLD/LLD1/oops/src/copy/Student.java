package copy;

public class Student{
    private String name;
    Batch batch;

    public Student(String name, Batch batch) {
        this.name = name;
        this.batch = batch;
    }

    public Student(Student student) {
        // Shallow Copy
        // this.batch = student.batch;

        // Deep Copy
        this.batch = new Batch(student.batch);
        this.name = student.name;
    }

    public String getBatch() {
        return batch.getName();
    }
}
