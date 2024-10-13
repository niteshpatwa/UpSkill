package copy;

public class Batch {
    String name;
    int headCount;

    public Batch(String name, int headCount) {
        this.name = name;
        this.headCount = headCount;
    }

    public Batch(Batch batch) {
        this.name = batch.name;
        this.headCount = batch.headCount;
    }

    public String getName() {
        return name;
    }
}
