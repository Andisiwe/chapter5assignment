package za.ac.cput.chapter5assignment.Prototype;

/**
 * Created by student on 2015/03/12.
 */
public class Lecturer implements CloneObject {
    private String name;

    public Lecturer(String name) {
        this.name = name;
    }

    @Override
    public CloneObject makeCopy() {
        return new Lecturer(name);
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "name='" + name + '\'' +
                '}';
    }
}
