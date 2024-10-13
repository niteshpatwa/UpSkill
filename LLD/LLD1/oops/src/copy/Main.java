package copy;

public class Main {
    public static void main(String[] args){
        Batch batch1 = new Batch("Intermediate May", 90);
        Student student1 = new Student("John", batch1);

        Student student2 = new Student(student1);
        student2.batch.name = "Beginner May";

        System.out.println(student1.getBatch());
        System.out.println(student2.getBatch());
    }
}
